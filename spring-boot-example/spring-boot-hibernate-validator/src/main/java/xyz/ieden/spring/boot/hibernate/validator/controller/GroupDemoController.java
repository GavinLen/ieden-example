package xyz.ieden.spring.boot.hibernate.validator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.util.ResultUtils;
import xyz.ieden.spring.boot.hibernate.validator.group.ValidatorGroupA;
import xyz.ieden.spring.boot.hibernate.validator.model.Person;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/23 19:30
 */
@Slf4j
@RestController
@RequestMapping(value = "group")
public class GroupDemoController {

    @GetMapping()
    public Result<Person> getPerson(@Validated(ValidatorGroupA.class) Person reqPerson) {
        Integer userId = reqPerson.getUserId();
        Person person = new Person(userId, "", 1, "");
        return ResultUtils.getSuccess(person);
    }

}
