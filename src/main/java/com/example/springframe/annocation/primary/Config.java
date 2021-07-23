package com.example.springframe.annocation.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.sql.Connection;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/22
 */

@Configuration
public class Config{
    /**
     *  相同的bean类型
     * @return
     */
    @Primary
    @Bean
    public Connection mySQLConnection() {
        return new MySQLConnection();
    }
    @Qualifier("datasource1")
    @Bean
    public Connection oracleConnection() {
        return new OracleConnection();
    }
}
