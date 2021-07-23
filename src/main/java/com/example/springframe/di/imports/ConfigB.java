package com.example.springframe.di.imports;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
@Configuration
@Import(ConfigA.class)
public class ConfigB {
    @Bean
    public B b() {
       B b= new B();
       b.setName("B");
       return b;
    }
}
