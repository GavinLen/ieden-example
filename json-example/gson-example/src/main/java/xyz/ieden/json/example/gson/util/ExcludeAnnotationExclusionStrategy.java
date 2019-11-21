package xyz.ieden.json.example.gson.util;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import xyz.ieden.json.example.gson.annotation.Exclude;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/20 17:58
 */
public class ExcludeAnnotationExclusionStrategy implements ExclusionStrategy {
    /**
     * 跳过字段
     *
     * @param f
     * @return
     */
    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        Exclude annotation = f.getAnnotation(Exclude.class);
        if (annotation == null) {
            return false;
        }
        return annotation.value();
    }

    /**
     * 跳过类
     *
     * @param clazz
     * @return
     */
    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
}
