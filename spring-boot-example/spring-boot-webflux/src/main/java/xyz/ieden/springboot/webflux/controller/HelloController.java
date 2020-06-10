package xyz.ieden.springboot.webflux.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.entity.User;
import xyz.ieden.spring.boot.example.common.util.ResultUtils;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/6/10 14:57
 */
@Slf4j
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping(value = "mono")
    public Mono<User> user() {
        User user = new User();
        user.setStringVal("user");
        return Mono.just(user);
    }

    @GetMapping(value = "index")
    public Result<String> hello() {
        return ResultUtils.getSuccess("Hello");
    }
}
