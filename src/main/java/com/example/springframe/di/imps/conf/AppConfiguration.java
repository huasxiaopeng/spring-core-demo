package com.example.springframe.di.imps.conf;

import com.example.springframe.di.imps.service.EmailService;
import com.example.springframe.di.imps.service.MessageService;
import com.example.springframe.di.imps.service.SMSService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
@Configuration
@ComponentScan("com.example.springframe.di.imps")
@Import(AppConfiguration2.class)
public class AppConfiguration {
    @Bean(name="emailService")
    public MessageService emailService(){
        return new EmailService();
    }

    @Bean(name="smsService")
    public MessageService smsService(){
        return new SMSService();
    }
}
