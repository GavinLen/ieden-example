package xyz.ieden.example.spring.annotation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Book
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer id;
    private String name;

}
