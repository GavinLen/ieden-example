package xyz.ieden.example.spring.annotation.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * LinuxConditional
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:21
 */
public class LinuxConditional implements Condition {

    /**
     * @param context  判断条件使用的上下文
     * @param metadata 注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        ClassLoader classLoader = context.getClassLoader();
        Environment environment = context.getEnvironment();
        BeanDefinitionRegistry registry = context.getRegistry();
        String osName = environment.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            return true;
        }
        return false;
    }
}
