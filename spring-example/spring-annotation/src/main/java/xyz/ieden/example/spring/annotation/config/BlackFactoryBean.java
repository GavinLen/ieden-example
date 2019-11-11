package xyz.ieden.example.spring.annotation.config;

import org.springframework.beans.factory.FactoryBean;
import xyz.ieden.example.spring.annotation.colour.Black;

/**
 * BlackfACTORYbEAN
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:56
 */
public class BlackFactoryBean implements FactoryBean<Black> {
    @Override
    public Black getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
