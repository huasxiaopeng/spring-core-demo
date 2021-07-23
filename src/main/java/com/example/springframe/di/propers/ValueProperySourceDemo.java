package com.example.springframe.di.propers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Description 使用 @Value 注解
 * @Author lktbz
 * @Date 2021/07/23
 */
@Configuration
@PropertySource("classpath:config.properties")
public class ValueProperySourceDemo implements InitializingBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValueProperySourceDemo.class);

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Autowired
    Environment env;
    @Override
    public void afterPropertiesSet() throws Exception {
       LOGGER.error("读取配置文件的信息为：");
        LOGGER.error(driver);
        LOGGER.error(url);
        LOGGER.error(password);
        LOGGER.error(username);
        LOGGER.error("即将进行bean 属性填充。。");
        setDatabaseConfig();
    }

    private void setDatabaseConfig() {
        DataSourceConfig config = new DataSourceConfig();
        config.setDriver(env.getProperty("jdbc.driver"));
        config.setUrl(env.getProperty("jdbc.url"));
        config.setUsername(env.getProperty("jdbc.username"));
        config.setPassword(env.getProperty("jdbc.password"));
        System.out.println(config.toString());
    }
}
