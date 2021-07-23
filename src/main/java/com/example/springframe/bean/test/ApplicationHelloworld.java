package com.example.springframe.bean.test;

import com.example.springframe.bean.AppConfig;
import com.example.springframe.bean.domain.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class ApplicationHelloworld {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       //获取bean
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.close();
    }
}
