package com.example.springframe.di.inject;

import com.example.springframe.di.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Description set 注入
 * @Author lktbz
 * @Date 2021/07/22
 */
@Component
public class SetterBasedInjection {
    private MessageService messageService;

    @Autowired
    @Qualifier("TwitterService")
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
