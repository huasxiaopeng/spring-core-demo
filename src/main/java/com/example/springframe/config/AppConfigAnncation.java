package com.example.springframe.config;

import com.example.springframe.di.init.CompareBeanInitDemo;
import com.example.springframe.di.init.DatabaseInitiaizerDemo2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 注解方式初始化bean
 * @Author lktbz
 * @Date 2021/07/22
 */
@Configuration
public class AppConfigAnncation {
    //注解方式
//    @Bean(initMethod = "init",destroyMethod ="destroy" )
//    public DatabaseInitiaizerDemo2 databaseInitiaizerDemo2(){
//        return new DatabaseInitiaizerDemo2();
//    }
    @Bean(initMethod = "init",destroyMethod ="des")
    public CompareBeanInitDemo compareBeanInitDemo(){
        return new CompareBeanInitDemo();
    }
}
