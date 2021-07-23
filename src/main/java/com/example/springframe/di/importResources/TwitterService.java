package com.example.springframe.di.importResources;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
public class TwitterService implements MessageService{

    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }

}