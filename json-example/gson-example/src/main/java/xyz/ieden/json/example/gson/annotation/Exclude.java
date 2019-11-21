package xyz.ieden.json.example.gson.annotation;

import java.lang.annotation.*;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/20 17:45
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Exclude {
    boolean value() default true;
}
