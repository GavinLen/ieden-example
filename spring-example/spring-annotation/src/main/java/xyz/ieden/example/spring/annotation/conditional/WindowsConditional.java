package xyz.ieden.example.spring.annotation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * LinuxConditional
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:21
 */
public class WindowsConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            return true;
        }
        return false;
    }
}
