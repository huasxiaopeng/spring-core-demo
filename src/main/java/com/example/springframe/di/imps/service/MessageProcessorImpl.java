package com.example.springframe.di.imps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
@Service
public class MessageProcessorImpl implements MessageProcessor {
    private MessageService messageService;

    @Autowired
    public MessageProcessorImpl(@Qualifier("twitterService") MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
