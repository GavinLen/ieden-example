package xyz.ieden.spring.boot.hibernate.validator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xyz.ieden.spring.boot.hibernate.validator.group.ValidatorGroupA;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/23 19:39
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    /**
     * 用户id
     */
    @NotNull(message = "userId 不能为 Null", groups = ValidatorGroupA.class)
    private Integer userId;

    /**
     * 用户名
     */
    @NotEmpty(message = "UserName 不能为空白")
    private String userName;

    /**
     * 年龄
     */
    @NotNull()
    private Integer age;

    /**
     * 地址
     */
    @NotEmpty(message = "地址不能为空")
    private String address;
}
