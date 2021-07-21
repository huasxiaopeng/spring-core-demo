package com.example.springframe.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Description 简单的spring事件
 * @Author lktbz
 * @Date 2021/07/21
 */
public class SpringEventDemo {
    public static void main(String[] args) {
        GenericApplicationContext context=new GenericApplicationContext();
        context.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("接收到spring事件"+event);
            }
        });
        // // 启动 Spring 应用上下文
        context.refresh();
        // 启动 Spring 上下文
        context.start();
        // 关闭 Spring 应用上下文
        context.close();
    }
}
