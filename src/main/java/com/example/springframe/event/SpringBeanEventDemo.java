package com.example.springframe.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @Description 使用 spring bean 方式注册事件
 * @Author lktbz
 * @Date 2021/07/21
 */
public class SpringBeanEventDemo  implements ApplicationEventPublisherAware {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(SpringBeanEventDemo.class);

        context.addApplicationListener(new ApplicationListener<ApplicationEvent>() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                println("ApplicationListener - 接收到 Spring 事件：" + event);
            }
        });

        //注册bean
        context.register(MyEventListner.class);
        context.refresh();
        context.close();
    }

    /**
     *  回调事件
     * @param applicationEventPublisher
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        applicationEventPublisher.publishEvent(new ApplicationEvent("hello world") {
        });
        applicationEventPublisher.publishEvent("hello wold");
    }

    static  class MyEventListner implements ApplicationListener<ContextRefreshedEvent>{
    //ContextRefreshedEvent 监听
        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {
            System.out.println("监听到事件。。。"+event);
        }
    }
    @EventListener
    public void OneventDemo(ApplicationEvent event){
        System.out.println("坚挺到事件"+event.getSource());
    }
    private static void println(Object printable) {
        System.out.printf("[线程：%s] : %s\n", Thread.currentThread().getName(), printable);
    }
}
