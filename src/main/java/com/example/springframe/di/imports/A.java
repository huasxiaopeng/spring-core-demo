package com.example.springframe.di.imports;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/23
 */
public class A {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
