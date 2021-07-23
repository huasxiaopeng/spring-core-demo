package com.example.springframe.bean.domain;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("My Message : " + message);
    }
}
