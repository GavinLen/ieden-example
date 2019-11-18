package xyz.ieden.spring.boot.example.common.entity;

import lombok.Data;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/15 17:26
 */
@Data
public class User {

    private Byte byteVal;
    private Short shortVal;
    private Integer integerVal;
    private Long longVal;
    private Float floatVal;
    private Double doubleVal;
    private String stringVal;
    private Boolean booleanVal;

}
