package com.example.springframe.bean;

import com.example.springframe.bean.domain.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description  java配置bean
 * @Author lktbz
 * @Date 2021/07/22
 */
@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}
