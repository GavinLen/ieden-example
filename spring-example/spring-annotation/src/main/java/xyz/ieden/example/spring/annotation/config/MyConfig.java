package xyz.ieden.example.spring.annotation.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import xyz.ieden.example.spring.annotation.bean.User;

import java.util.Date;

/**
 * MyConfig:
 * Spring 的配置文件
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/10 20:28
 */
@Configuration
@ComponentScan(value = {"xyz.ieden.example.spring.annotation"}, includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)}, useDefaultFilters = false)
public class MyConfig {

    @Bean
    public User user() {
        User user = new User(1, "tom", new Date());
        return user;
    }
}
