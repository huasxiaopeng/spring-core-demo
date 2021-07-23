package com.example.springframe.di.test;

import com.example.springframe.config.AppConfiguration;
import com.example.springframe.di.inject.ConstructorBasedInjection;
import com.example.springframe.di.inject.SetterBasedInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description 注入测试
 * @Author lktbz
 * @Date 2021/07/22
 */
public class InjectApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
//       构造器注入
//        ConstructorBasedInjection  fieldBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
//        fieldBasedInjection.processMsg("twitter message sending ");
//        set注入
        SetterBasedInjection setterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
        setterBasedInjection.processMsg("twitter message sending ");
    }
}
