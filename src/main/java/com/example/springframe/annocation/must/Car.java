package com.example.springframe.annocation.must;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description 注入的几种方式
 * @Author lktbz
 * @Date 2021/07/22
 */
public class Car {
    /**
     * 字段注入
     */
    @Autowired
    private Engine engine;

    /**
     *  构造器注入
     * @param engine
     */
    @Autowired
    Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * set 注入
     * @param engine
     */
    @Autowired
    void setEngine(Engine engine) {
        this.engine = engine;
    }


}
