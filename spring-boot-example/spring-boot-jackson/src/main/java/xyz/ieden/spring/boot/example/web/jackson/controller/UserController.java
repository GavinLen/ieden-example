package xyz.ieden.spring.boot.example.web.jackson.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.entity.User;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/15 17:37
 */
@Slf4j
@RestController
@RequestMapping(value = "user")
public class UserController {

    @GetMapping(value = "{id}")
    public Result<User> getUserById(@PathVariable(value = "id") Integer id) {
        User user = new User();
        return new Result<>(1, "success", user);
    }
}
