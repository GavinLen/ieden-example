package xyz.ieden.spring.boot.hibernate.validator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import xyz.ieden.spring.boot.hibernate.validator.group.ValidatorGroupA;
import xyz.ieden.spring.boot.hibernate.validator.group.ValidatorGroupB;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

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
    @NotBlank(message = "UserName 不能为空白", groups = ValidatorGroupB.class)
    private String userName;

    /**
     * 年龄
     */
    @NotNull()
    private Integer age;

    /**
     * 地址
     */
    @NotBlank(message = "地址不能为空", groups = {ValidatorGroupB.class})
    private String address;
}
