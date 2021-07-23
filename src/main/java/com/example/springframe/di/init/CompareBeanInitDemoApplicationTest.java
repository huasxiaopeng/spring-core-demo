package com.example.springframe.di.init;

import com.example.springframe.config.AppConfigAnncation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class CompareBeanInitDemoApplicationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigAnncation.class);
        Object compareBeanInitDemo = context.getBean("compareBeanInitDemo");
        context.close();
    }
}
