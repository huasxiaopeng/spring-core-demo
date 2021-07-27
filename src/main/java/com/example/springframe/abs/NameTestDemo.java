package com.example.springframe.abs;

/**
 * @Description instanceof 使用
 * @Author lktbz
 * @Date 2021/07/25
 */
public class NameTestDemo {
    public static void main(String[] args) {
        NameAbstractDemo nameAbstractDemo=new JerryNameDemo("jerry");
        if(nameAbstractDemo instanceof JerryNameDemo){
            String s = nameAbstractDemo.sayName();
            System.out.println(s);
        }
    }
}
