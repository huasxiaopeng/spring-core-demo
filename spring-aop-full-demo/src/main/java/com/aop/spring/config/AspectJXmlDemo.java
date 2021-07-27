package com.aop.spring.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试是否配置成功  01
 * @Author lktbz
 * @Date 2021/07/27
 */
@Aspect
@Configuration
public class AspectJXmlDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/META-INF/spring-aop-context.xml");

        context.close();

    }
}
