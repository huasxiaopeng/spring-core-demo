package com.example.springframe.di.depends.on;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */
public class FirstBean {
    @Autowired
    private SecondBean secondBean;

    @Autowired
    private ThirdBean thirdBean;

    public FirstBean() {
        System.out.println("FirstBean Initialized via Constuctor");
    }

    public void populateBeans() {
        secondBean.display();
        thirdBean.display();
    }
}
