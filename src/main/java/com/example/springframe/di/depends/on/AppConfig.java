package com.example.springframe.di.depends.on;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
@Configuration
public class AppConfig {

    /**
     * 初始化之前先初始化另外两个
     * @return
     */
    @Bean("firstBean")
    @DependsOn(value = {
            "secondBean",
            "thirdBean"
    })
    public FirstBean firstBean() {
        return new FirstBean();
    }
    @Bean("secondBean")
    public SecondBean secondBean() {
        return new SecondBean();
    }

    @Bean("thirdBean")
    public ThirdBean thirdBean() {
        return new ThirdBean();
    }
}
