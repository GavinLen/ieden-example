package xyz.ieden.example.mapstruct.bo;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.BeforeClass;
import org.junit.Test;
import xyz.ieden.example.mapstruct.bo.UserBO;
import xyz.ieden.example.mapstruct.bo.UserMapper;
import xyz.ieden.example.mapstruct.entity.AccountEntity;
import xyz.ieden.example.mapstruct.entity.UserEntity;

import java.util.Date;

public class UserBOTest {

    private static UserEntity userEntity;
    private static AccountEntity accountEntity;


    @BeforeClass
    public static void initEntity() {
        userEntity = new UserEntity(100L, "tom_1", "tom@123.com", new Date());
        accountEntity = new AccountEntity(100L, "tomcat", "123123", "18900000000", "IC2345789");
    }

    @Test
    public void testUpdateBO() {
        UserBO sourceUser = new UserBO();
        sourceUser.setUsername("tom_update");
        sourceUser.setMail("tom_update@163.com");

        UserMapper userMapper = UserMapper.INSTANCES;
        UserBO targetUser = userMapper.entityToBo(userEntity, accountEntity);

        // 根据 sourceUser 更新 targetUser
        UserBO updateUser = userMapper.updateBO(sourceUser, targetUser);

        printInfo(updateUser);

    }

    @Test
    public void testMixtureEntityToBo() {
        UserMapper userMapper = UserMapper.INSTANCES;
        UserBO userBO = userMapper.entityToBo(userEntity, "tom", "19000000001");
        printInfo(userBO);
    }

    @Test
    public void testCombineEntityToBo() {
        UserMapper userMapper = UserMapper.INSTANCES;
        UserBO userBO = userMapper.entityToBo(userEntity, accountEntity);
        printInfo(userBO);
    }

    @Test
    public void testSimpleEntityToBo() {
        UserMapper userMapper = UserMapper.INSTANCES;
        UserBO userBO = userMapper.entityToBo(userEntity);
        printInfo(userBO);
    }

    private void printInfo(UserBO userBO) {
        System.out.println(ToStringBuilder.reflectionToString(userBO, ToStringStyle.JSON_STYLE));
    }

}