package com.example.springframe.di.imps;

import com.example.springframe.di.imps.conf.AppConfiguration;
import com.example.springframe.di.imps.service.MessageProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class ImpsApplicationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageProcessor  userService = applicationContext.getBean(MessageProcessor.class);
        userService.processMsg("twitter message sending ");
    }
}
