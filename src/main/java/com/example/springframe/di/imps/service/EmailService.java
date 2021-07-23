package com.example.springframe.di.imps.service;

import org.springframework.stereotype.Service;

/**
 * @Description 服务实现
 * @Author lktbz
 * @Date 2021/07/22
 */
@Service
public class EmailService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
