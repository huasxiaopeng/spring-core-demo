package com.example.springframe.di.depends.on;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class DependsOnDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean bean = context.getBean(FirstBean.class);
        bean.populateBeans();
        context.close();
    }
}
