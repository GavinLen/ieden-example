package xyz.ieden.spring.boot.example.swagger.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/18 14:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    /**
     * ID
     */
    private Integer id;
    /**
     * name
     */
    private String name;
}
