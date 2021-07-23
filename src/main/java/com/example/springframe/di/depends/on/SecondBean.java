package com.example.springframe.di.depends.on;

/**
 * @Description 提前初始化的bean
 * @Author lktbz
 * @Date 2021/07/22
 */
public class SecondBean {

        public SecondBean() {
            System.out.println("SecondBean Initialized via Constuctor");
        }

        public void display() {
            System.out.println("SecondBean method called");
        }

}
