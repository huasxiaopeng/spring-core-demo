package com.example.springframe.bean.test;

import com.example.springframe.bean.domain.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 使用xml 方式装在bean
 * @Author lktbz
 * @Date 2021/07/22
 */
public class ApplicationXmlHelloworld {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorldXml = context.getBean("helloWorldXml", HelloWorld.class);
        helloWorldXml.getMessage();

    }


}
