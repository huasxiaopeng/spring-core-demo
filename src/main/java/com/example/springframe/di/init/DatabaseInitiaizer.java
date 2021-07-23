package com.example.springframe.di.init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description bean 生命周期，创建于销毁方式一:
 * @Author lktbz
 * @Date 2021/07/22
 */
@Component
public class DatabaseInitiaizer implements InitializingBean, DisposableBean {
    private List< User > listOfUsers = new ArrayList< >();


    @Override
    public void destroy() throws Exception {
        listOfUsers.clear();
        System.out.println("------DisposableBean-----After of users removed from List in destroy() method ------------");
        for (Iterator < User > iterator = listOfUsers.iterator(); iterator.hasNext();) {
            User user3 = (User) iterator.next();
            System.out.println(user3.toString());
        }
        System.out.println("--DisposableBean-   List is clean up ..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        User user = new User(1, "User");
        User user1 = new User(2, "Admin");
        User user2 = new User(3, "SuperAdmin");

        listOfUsers.add(user);
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        System.out.println("---InitializingBean--------List of users added in init() method ------------");
        for (Iterator< User > iterator = listOfUsers.iterator(); iterator.hasNext();) {
            User user3 = (User) iterator.next();
            System.out.println(user3.toString());
        }
    }
}
