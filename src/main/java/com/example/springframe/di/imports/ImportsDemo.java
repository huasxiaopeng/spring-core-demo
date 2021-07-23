package com.example.springframe.di.imports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
public class ImportsDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);
        System.out.println(a);
        System.out.println(b);
    }
}
