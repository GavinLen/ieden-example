package xyz.ieden.spring.boot.example.swagger.user.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xyz.ieden.spring.boot.example.common.entity.User;
import xyz.ieden.spring.boot.example.swagger.user.entity.UserInfo;
import xyz.ieden.spring.boot.example.swagger.user.service.IUserInfoService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/16 11:31
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Override
    public Boolean delUserInfoById(Integer userId) {
        log.info("Del UserInfo By Id [{}].", userId);
        return Boolean.TRUE;
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo) {
        log.info("Update UserInfo Info:{}.", userInfo.toString());
        return userInfo;
    }

    @Override
    public UserInfo addUserInfo(UserInfo userInfo) {
        log.info("Add UserInfo Info:{}.", userInfo.toString());
        return userInfo;
    }

    @Override
    public List<UserInfo> getUserInfo() {
        log.info("Get UserInfo List.");
        return getUserInfoList();
    }

    @Override
    public UserInfo getUserInfoById(Integer userId) {
        log.info("Get Id [{}] 对应的 UserInfo.", userId);
        return getUserInfo(userId);
    }

    private List<UserInfo> getUserInfoList() {
        List<UserInfo> userInfoList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            final UserInfo userInfo = getUserInfo(i);
            userInfoList.add(userInfo);
        }
        return userInfoList;
    }

    private UserInfo getUserInfo(Integer userId) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userId);
        userInfo.setName("tom_" + userId);
        userInfo.setAge((userId.shortValue()));
        userInfo.setCreateTime(new Date());
        userInfo.setEmail(userInfo.getName() + "@email.com");
        return userInfo;
    }
}
