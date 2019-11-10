package xyz.ieden.example.spring.annotation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * User
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/10 20:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String userName;
    private Date createTime;

}
