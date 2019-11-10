package xyz.ieden.example.spring.annotation.config;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.ieden.example.spring.annotation.bean.User;

import java.util.Arrays;

public class MyConfigTest {

    private static ApplicationContext applicationContext;

    @BeforeClass
    public static void init() {
        applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    public void testComponentScan() {
        String[] beanNameArr = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanNameArr) {
            System.out.println(beanName);
        }
    }

    @Test
    public void testGetBean() {

        User userByClass = applicationContext.getBean(User.class);
        System.out.println(userByClass.toString());
        Object userByName = applicationContext.getBean("user");
        System.out.println(userByName.toString());

        String[] beanNameArr = applicationContext.getBeanNamesForType(User.class);
        System.out.println(Arrays.asList(beanNameArr));
    }
}