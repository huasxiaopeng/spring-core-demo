package com.thymeleaf.domain;

import lombok.Data;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/24
 */
@Data
public class Role {
    private String role;

    public Role(String role) {
        super();
        this.role = role;
    }
}
