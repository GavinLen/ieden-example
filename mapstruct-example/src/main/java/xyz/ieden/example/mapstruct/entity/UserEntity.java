package xyz.ieden.example.mapstruct.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 9:51
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    private Long userId;
    private String userName;
    private String email;
    private Date createDateTime;
}
