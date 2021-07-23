package com.example.springframe.di.imports;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
@Configuration
public class ConfigA {

    @Bean
    public A a() {
        A a= new A();
        a.setName("A");
        return a;
    }
}
