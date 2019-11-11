package xyz.ieden.example.spring.annotation.config;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import xyz.ieden.example.spring.annotation.bean.User;

import java.util.Arrays;
import java.util.Map;

/**
 * ConditionalConfigTest
 *
 * @author gavin
 * @version 1.0
 * @date 2019/11/11 23:12
 */
public class ConditionalConfigTest {

    private static ApplicationContext applicationContext;

    @BeforeClass
    public static void init() {
        applicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);
    }


    @Test
    public void testGetBean() {

        Environment environment = applicationContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("os.name:" + osName);

        Map<String, User> map = applicationContext.getBeansOfType(User.class);
        System.out.println(map);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.asList(beanDefinitionNames));
    }

}
