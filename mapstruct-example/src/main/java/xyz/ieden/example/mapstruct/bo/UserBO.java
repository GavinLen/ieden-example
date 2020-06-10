package xyz.ieden.example.mapstruct.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 9:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserBO {

    private Long id;
    private String username;
    private String mail;
    private Date createTime;
    private String account;
    private String userPassword;
    private String bindingPhoneNum;
    private String uniqueId;
}
