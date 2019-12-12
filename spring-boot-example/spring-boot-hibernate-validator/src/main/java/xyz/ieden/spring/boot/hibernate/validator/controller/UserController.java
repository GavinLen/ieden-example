package xyz.ieden.spring.boot.hibernate.validator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.util.ResultUtils;
import xyz.ieden.spring.boot.hibernate.validator.model.UserModel;

import javax.validation.Valid;
import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/12 19:56
 */
@Slf4j
@RestController
@RequestMapping(value = "user")
public class UserController {

    @PutMapping()
    public Result<Boolean> registerUser(@Valid UserModel userModel) throws Exception {
        log.info("UserInfo:[{}].", userModel.toString());
        return ResultUtils.getSuccess(Boolean.TRUE);
    }

    @GetMapping()
    public Result<UserModel> getUserModel() {
        UserModel userModel = new UserModel(1L, "tom", "123", "tom@123.com", (short) 1, Boolean.FALSE, new Date());
        return ResultUtils.getSuccess(userModel);
    }

}
