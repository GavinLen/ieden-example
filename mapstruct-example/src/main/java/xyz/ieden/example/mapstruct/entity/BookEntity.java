package xyz.ieden.example.mapstruct.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 14:41
 */
@Setter
@Getter
public class BookEntity {

    private Long id;
    private String bookName;
    private Boolean showTag;
}
