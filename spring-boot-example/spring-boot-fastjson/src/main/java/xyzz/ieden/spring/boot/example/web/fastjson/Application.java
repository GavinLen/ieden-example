package xyzz.ieden.spring.boot.example.web.fastjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/14 21:03
 */
@SpringBootApplication
public class Application {

    public static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(Application.class, args);
    }

}
