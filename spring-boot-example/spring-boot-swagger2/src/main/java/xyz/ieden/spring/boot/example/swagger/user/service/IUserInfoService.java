package xyz.ieden.spring.boot.example.swagger.user.service;

import xyz.ieden.spring.boot.example.swagger.user.entity.UserInfo;

import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/16 11:30
 */
public interface IUserInfoService {

    /**
     * 通过 id 删除 UserInfo
     *
     * @param userId
     * @return
     */
    Boolean delUserInfoById(Integer userId);

    /**
     * 更新 UserInfo
     *
     * @param userInfo
     * @return
     */
    UserInfo updateUserInfo(UserInfo userInfo);

    /**
     * 添加 UserInfo
     *
     * @param userInfo
     * @return
     */
    UserInfo addUserInfo(UserInfo userInfo);

    /**
     * 获取 UserInfo 列表
     *
     * @return
     */
    List<UserInfo> getUserInfo();

    /**
     * 通过 id 获取 UserInfo
     *
     * @param userId
     * @return
     */
    UserInfo getUserInfoById(Integer userId);

}
