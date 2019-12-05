package xyz.ieden.spring.boot.admin.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/5 19:59
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "hello";
    }
}
