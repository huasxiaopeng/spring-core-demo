package com.example.springframe.di.service;

import org.springframework.stereotype.Service;

/**
 * @Description email 服务
 * @Author lktbz
 * @Date 2021/07/22
 */
@Service("EmailService")
public class EmailService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
