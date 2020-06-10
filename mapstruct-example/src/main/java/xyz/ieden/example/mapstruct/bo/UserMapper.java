package xyz.ieden.example.mapstruct.bo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import xyz.ieden.example.mapstruct.entity.AccountEntity;
import xyz.ieden.example.mapstruct.entity.UserEntity;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/21 9:54
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCES = Mappers.getMapper(UserMapper.class);

    @Mappings(value = {
            @Mapping(source = "userId", target = "id"),
            @Mapping(source = "userName", target = "username"),
            @Mapping(source = "email", target = "mail"),
            @Mapping(source = "createDateTime", target = "createTime")
    })
    UserBO entityToBo(UserEntity userEntity);

    @Mappings(value = {
            @Mapping(source = "userEntity.userId", target = "id"),
            @Mapping(source = "userEntity.userName", target = "username"),
            @Mapping(source = "accountEntity.account", target = "account"),
            @Mapping(source = "accountEntity.bindingPhoneNum", target = "bindingPhoneNum")
    })
    UserBO entityToBo(UserEntity userEntity, AccountEntity accountEntity);

    @Mappings(value = {
            @Mapping(source = "userEntity.userId", target = "id"),
            @Mapping(source = "userEntity.userName", target = "username")
    })
    UserBO entityToBo(UserEntity userEntity, String account, String bindingPhoneNum);


    UserBO updateBO(UserBO sourceUser, @MappingTarget UserBO targetUser);
}
