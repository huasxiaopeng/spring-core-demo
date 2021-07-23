package com.example.springframe.di.importResources;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
public class MessageProcessorImpl implements MessageProcessor {

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}