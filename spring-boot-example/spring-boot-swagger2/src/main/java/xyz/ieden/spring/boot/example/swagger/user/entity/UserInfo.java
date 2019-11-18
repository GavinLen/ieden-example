package xyz.ieden.spring.boot.example.swagger.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/16 11:44
 */
@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    /**
     * ID
     */
    @ApiModelProperty(value = "id")
    private Integer id;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Short age;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * e-mail
     */
    @ApiModelProperty
    private String email;

}
