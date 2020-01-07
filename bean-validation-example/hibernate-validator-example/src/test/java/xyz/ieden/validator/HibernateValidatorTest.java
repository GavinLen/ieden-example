package xyz.ieden.validator;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import xyz.ieden.validator.bean.UserInfo;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

@Slf4j
public class HibernateValidatorTest {

    private static Validator validator;
    private Set<ConstraintViolation<UserInfo>> set;

    @BeforeClass
    public static void setValidation() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @After
    public void printMessage() {
        if (CollectionUtils.isNotEmpty(set)) {
            Iterator<ConstraintViolation<UserInfo>> iterator = set.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation<UserInfo> next = iterator.next();
                log.info("[{}] 对应的 Message [{}].", next.getPropertyPath(), next.getMessage());
            }
        }
    }

    @Test
    public void userInfo() {
        UserInfo userInfo = new UserInfo(Long.valueOf("1001"), "t", "123", Short.valueOf("201"), "tom@123");
        Set<ConstraintViolation<UserInfo>> resultSet = validator.validate(userInfo);
        Assert.assertEquals(resultSet.size(), 3);
        set = resultSet;
    }

    @Test
    public void emailMode() {
        UserInfo userInfo = new UserInfo(Long.valueOf("1001"), "tom", "123123", Short.valueOf("15"), "tom");
        Set<ConstraintViolation<UserInfo>> resultSet = validator.validate(userInfo);
        Assert.assertEquals(resultSet.size(), 1);
        set = resultSet;
    }

    @Test
    public void ageScope() {
        UserInfo userInfo = new UserInfo(Long.valueOf("1001"), "tom", "123123", Short.valueOf("201"), "tom@123.com");
        Set<ConstraintViolation<UserInfo>> resultSet = validator.validate(userInfo);
        Assert.assertEquals(resultSet.size(), 1);
        set = resultSet;
    }

    @Test
    public void usernameSizeScope() {
        UserInfo userInfo = new UserInfo(Long.valueOf("1001"), "t", "123123", Short.valueOf("12"), "tom@123.com");
        Set<ConstraintViolation<UserInfo>> resultSet = validator.validate(userInfo);
        Assert.assertEquals(resultSet.size(), 1);
        set = resultSet;
    }

    @Test
    public void usernameIsNull() {
        UserInfo userInfo = new UserInfo(Long.valueOf("1001"), null, "123123", Short.valueOf("12"), "tom@123.com");
        Set<ConstraintViolation<UserInfo>> resultSet = validator.validate(userInfo);
        Assert.assertEquals(resultSet.size(), 1);
        set = resultSet;
    }

    /**
     * 验证 @NotNull
     */
    @Test
    public void idIsNull() {
        UserInfo userInfo = new UserInfo(null, "tom", "123123", Short.valueOf("12"), "tom@123.com");
        Set<ConstraintViolation<UserInfo>> resultSet = validator.validate(userInfo);
        Assert.assertEquals(resultSet.size(), 1);
        set = resultSet;
    }

}