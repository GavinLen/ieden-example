package xyz.ieden.json.example.gson.entity;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/20 16:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    @Expose(serialize = false)
    private String password;
    private Date createDate;


}
