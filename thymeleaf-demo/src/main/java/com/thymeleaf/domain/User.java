package com.thymeleaf.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/24
 */
@Data
@Getter
@Setter
public class User {
    private String userName;
    private String email;
    private Role role;
    public User(String userName, String email, Role role) {
        super();
        this.userName = userName;
        this.email = email;
        this.role = role;
    }
}
