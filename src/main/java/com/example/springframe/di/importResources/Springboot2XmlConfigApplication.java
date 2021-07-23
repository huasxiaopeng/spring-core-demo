package com.example.springframe.di.importResources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class Springboot2XmlConfigApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Springboot2XmlConfigApplication.class, args);
        MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
        userService.processMsg("twitter message sending ");
    }
}
