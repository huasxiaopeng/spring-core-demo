package com.example.springframe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
@Configuration
/**
 * 扫描di 包
 */
@ComponentScan("com.example.springframe.di")
public class AppConfiguration {
}
