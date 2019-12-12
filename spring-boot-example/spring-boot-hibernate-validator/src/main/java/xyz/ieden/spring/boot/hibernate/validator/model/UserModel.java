package xyz.ieden.spring.boot.hibernate.validator.model;

import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/12 19:45
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @NotNull(message = "Id 不能为空")
    private Long id;
    @NotBlank(message = "名称不能为空")
    private String username;
    private String password;
    @Email(message = "Email 格式不合法")
    private String email;
    @Max(value = 200, message = "年龄不合法")
    private Short age;
    @AssertFalse(message = "登录状态不合法")
    private Boolean loginStatus;
    private Date createTime;
}
