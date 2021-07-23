package com.example.springframe.di.inject;

import com.example.springframe.di.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Description 模拟controller
 * @Author lktbz
 * @Date 2021/07/22
 */
@Component
public class ConstructorBasedInjection {
    private MessageService messageService;
    @Autowired
    public ConstructorBasedInjection(@Qualifier("TwitterService") MessageService messageService) {
        super();
        this.messageService = messageService;
    }

    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
