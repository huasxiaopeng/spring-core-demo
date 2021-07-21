package com.example.springframe.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Description 基于注解的spring 事件
 * @Author lktbz
 * @Date 2021/07/21
 */

public class SpringAnnocationEventDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(SpringAnnocationEventDemo.class);
        context.refresh();
        context.close();
    }
    @EventListener
    @Order(4)//模拟事件的执行顺序
    public void oneEvent(ApplicationEvent event){
        println("接收到事件one-- "+event);
    }
    @EventListener
    @Order(3) //顺序执行，数字大的反而最后执行
    public void oneEvent1(ApplicationEvent event){
        println("接收到事件two--"+event);
    }
    /**
     * 多事件处理
     */
    @EventListener
    public void onMultEvent(ContextRefreshedEvent refreshedEvent){
        println("事件ContextRefreshedEvent："+refreshedEvent);
    }
    @EventListener
    public void onMultEventwo( ContextClosedEvent closedEvent){

        println("事件ContextClosedEvent："+closedEvent);
    }
    /**
     * 异步执行
     * @param printable
     */
//    @EventListener
//    @Async
//    public void onMultEventAsyn(ContextRefreshedEvent refreshedEvent){
//        println("事件ContextRefreshedEvent异步执行："+refreshedEvent);
//    }
    private static void println(Object printable) {
        System.out.printf("[线程：%s] : %s\n", Thread.currentThread().getName(), printable);
    }
}

