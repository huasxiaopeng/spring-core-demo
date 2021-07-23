package com.example.springframe.bean.test;

import com.example.springframe.bean.domain.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description 使用beanfactory
 * @Author lktbz
 * @Date 2021/07/22
 */
public class BeanFactoryDemo {
    public static void main(String[] args) {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        HelloWorld helloWorldXml = factory.getBean("helloWorldXml", HelloWorld.class);
        helloWorldXml.getMessage();
    }
}
