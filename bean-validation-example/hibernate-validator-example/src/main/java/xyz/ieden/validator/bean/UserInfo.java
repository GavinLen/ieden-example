package xyz.ieden.validator.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

/**
 * Car
 *
 * @author gavin
 * @version 1.0
 * @date 2019/12/29 12:45
 */
@Setter
@Getter
@AllArgsConstructor
public class UserInfo {

    @NotNull
    private Long id;
    @NotNull
    @Size(min = 2, max = 10)
    private String username;
    @NotNull
    @Size(min = 6, max = 8)
    private String password;
    @Min(0)
    @Max(200)
    private Short age;
    @Email
    private String email;

}
