package com.example.springframe.di.init;

import com.example.springframe.config.AppConfigAnncation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description 注解方式初始化bean
 * @Author lktbz
 * @Date 2021/07/22
 */
public class InitAnncationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigAnncation.class);
        context.close();
    }
}
