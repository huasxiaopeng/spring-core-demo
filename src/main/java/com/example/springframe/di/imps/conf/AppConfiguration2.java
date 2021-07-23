package com.example.springframe.di.imps.conf;

import com.example.springframe.di.imps.service.MessageProcessor;
import com.example.springframe.di.imps.service.MessageProcessorImpl;
import com.example.springframe.di.imps.service.MessageService;

import com.example.springframe.di.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 配置类
 * @Author lktbz
 * @Date 2021/07/22
 */
@Configuration
public class AppConfiguration2 {
    @Bean
    public MessageService twitterService(){
        return (MessageService) new TwitterService();
    }
    @Bean
    public MessageProcessor messageProcessor(){
        return new MessageProcessorImpl(twitterService());
    }
}
