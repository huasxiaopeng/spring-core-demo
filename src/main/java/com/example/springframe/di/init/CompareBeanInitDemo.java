package com.example.springframe.di.init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 三种bean的执行顺序初始化
 * @Author lktbz
 * @Date 2021/07/22
 *
 * 结论如下：
 * ----@PostConstruct init2-------List of users added in init() method ------------
 * ---InitializingBean--------List of users added in init() method ------------
 * ----@Bean init-------List of users added in init() method ------------
 * 09:55:47.948 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@4cc77c2e, started on Thu Jul 22 09:55:47 CST 2021
 * ----@PreDestroy des2-------List of users added in init() method ------------
 * ------DisposableBean-----After of users removed from List in destroy() method ------------
 * ----@Bean des-------List of users added in init() method ------------
 */

public class CompareBeanInitDemo  implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {

        System.out.println("------DisposableBean-----After of users removed from List in destroy() method ------------");

    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---InitializingBean--------List of users added in init() method ------------");

    }
    public void init() {
        System.out.println("----@Bean init-------List of users added in init() method ------------");

    }
    public void des(){
        System.out.println("----@Bean des-------List of users added in init() method ------------");
    }
    @PostConstruct
    public void init2() {
        System.out.println("----@PostConstruct init2-------List of users added in init() method ------------");

    }
    @PreDestroy
    public void des2(){
        System.out.println("----@PreDestroy des2-------List of users added in init() method ------------");
    }
}
