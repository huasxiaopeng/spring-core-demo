package com.aop.spring.use;

import com.aop.spring.config.AspectConfiguration;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.AspectInstanceFactory;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 使用api 方式完成一个aop操作 03
 * @Author lktbz
 * @Date 2021/07/27
 */
public class AspectJAnnotationUsingAPIDemo {
    public static void main(String[] args) {
        // 通过创建一个 HashMap 缓存，作为被代理对象
        Map<String ,Object> cache=new HashMap<>();
        //创建代理工厂
        AspectJProxyFactory factory=new AspectJProxyFactory(cache);
        // 增加 Aspect 配置类
        factory.addAspect(AspectConfiguration.class);
        // 设置暴露代理对象到 AopContext
        factory.setExposeProxy(true);
        /**
         * 添加通知消息
         */
        factory.addAdvice(new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                if("put".equals(method.getName())&&args.length==2){
                    System.out.printf("[MethodBeforeAdvice] 当前存放是 Key: %s , Value : %s ", args[0], args[1]);
                }
            }
        });
        // 通过代理对象存储数据
        Map<String, Object> proxy = factory.getProxy();
        proxy.put("1", "A");
        proxy.put("1", "B");
        System.out.println(cache.get("1"));
        /**
         * 通过api 方式，当调用put方法时，会进行增强
         */
    }
}
