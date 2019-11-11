package xyz.ieden.example.spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import xyz.ieden.example.spring.annotation.bean.Book;
import xyz.ieden.example.spring.annotation.bean.User;
import xyz.ieden.example.spring.annotation.conditional.LinuxConditional;
import xyz.ieden.example.spring.annotation.conditional.WindowsConditional;

import java.util.Date;

/**
 * ConditionalConfig
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:12
 */
@Configuration
@Import(value = Book.class)
public class ConditionalConfig {

    @Bean
    public User user() {
        return new User(1, "tom", new Date());
    }

    @Conditional(value = WindowsConditional.class)
    @Bean
    public User bill() {
        return new User(2, "bill", new Date());
    }

    @Conditional(value = LinuxConditional.class)
    @Bean
    public User linus() {
        return new User(3, "linus", new Date());
    }

}
