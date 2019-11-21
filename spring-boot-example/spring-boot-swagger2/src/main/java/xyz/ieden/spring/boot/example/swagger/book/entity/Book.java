package xyz.ieden.spring.boot.example.swagger.book.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/18 14:31
 */
@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    /**
     * ID
     */
    @ApiModelProperty(value = "ID", example = "0")
    private Integer id;
    /**
     * name
     */
    @ApiModelProperty(value = "名称", example = "SpringBoot In Action")
    private String name;
}
