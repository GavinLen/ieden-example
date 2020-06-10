package xyz.ieden.example.mapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 11:10
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

    private Long userId;
    private String account;
    private String password;
    private String bindingPhoneNum;
    private String uniqueId;

}
