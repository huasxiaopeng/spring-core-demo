package com.example.springframe.di.init;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description  使用注解方式初始化bean
 * @Author lktbz
 * @Date 2021/07/22
 */
@Component
public class DatabaseInitiaizerDemo2 {
    private List< User > listOfUsers = new ArrayList< >();

    public void init() {
        User user = new User(1, "User");
        User user1 = new User(2, "Admin");
        User user2 = new User(3, "SuperAdmin");

        listOfUsers.add(user);
        listOfUsers.add(user1);
        listOfUsers.add(user2);
        System.out.println("----@Bean init-------List of users added in init() method ------------");
        for (Iterator< User > iterator = listOfUsers.iterator(); iterator.hasNext();) {
            User user3 = (User) iterator.next();
            System.out.println("@Bean init   "+user3.toString());
        }
        // save to database

    }

    public void destroy() {
        // Delete from database
        listOfUsers.clear();
        System.out.println("---@Bean destroy-----After of users removed from List in destroy() method ------------");
        for (Iterator < User > iterator = listOfUsers.iterator(); iterator.hasNext();) {
            User user3 = (User) iterator.next();
            System.out.println(user3.toString());
        }
        System.out.println("@Bean destroy  End of destroy()  method");
    }
}
