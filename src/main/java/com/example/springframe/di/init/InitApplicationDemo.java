package com.example.springframe.di.init;

import com.example.springframe.config.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class InitApplicationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.close();
    }

}
