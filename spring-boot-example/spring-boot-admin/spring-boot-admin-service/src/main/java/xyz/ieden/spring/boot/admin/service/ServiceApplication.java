package xyz.ieden.spring.boot.admin.service;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/5 19:40
 */
@EnableAdminServer
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
