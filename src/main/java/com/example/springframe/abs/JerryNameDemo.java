package com.example.springframe;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/25
 */
public class JerryNameDemo extends NameAbstractDemo{
    private String name;

    public JerryNameDemo(String name) {
        this.name = name;
    }

    @Override
    public String sayName() {
        return name;
    }
}
