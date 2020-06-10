package xyz.ieden.spring.boot.example.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/6/10 18:29
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String bookName;
    private List<Byte> typeList;
    private Integer money;
}
