package com.example.springframe.di.imports;

import sun.dc.pr.PRError;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
public class B {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}
