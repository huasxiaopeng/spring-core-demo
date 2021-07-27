package com.example.springframe.abs;

import com.example.springframe.abs.NameAbstractDemo;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/25
 */
public class TomNameDemo extends NameAbstractDemo {
    private String name;

    public TomNameDemo(String name) {
        this.name = name;
    }

    @Override
    public String sayName() {
        return name;
    }
}
