package com.example.springframe.di.depends.on;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class ThirdBean {
    public ThirdBean() {
        System.out.println("ThirdBean Initialized via Constuctor");
    }

    public void display() {
        System.out.println("ThirdBean method called");
    }
}
