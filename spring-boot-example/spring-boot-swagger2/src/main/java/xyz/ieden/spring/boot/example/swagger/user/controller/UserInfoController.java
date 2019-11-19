package xyz.ieden.spring.boot.example.swagger.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.util.ResultUtils;
import xyz.ieden.spring.boot.example.swagger.user.entity.UserInfo;
import xyz.ieden.spring.boot.example.swagger.user.service.IUserInfoService;

import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/16 11:29
 */
@Api(value = "UserInfo API", tags = {"用户信息"})
@Slf4j
@RestController
@RequestMapping(value = "user")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @DeleteMapping(value = "{id}")
    public Result<Boolean> delUserInfo(@PathVariable(value = "id") Integer userId) {
        log.info("Del UserIfo By Id [{}].", userId);
        Boolean delResult = userInfoService.delUserInfoById(userId);
        return ResultUtils.getSuccess(delResult);
    }

    @PutMapping(value = "{id}")
    public Result<UserInfo> updUserInfo(@PathVariable(value = "id") Integer userId, UserInfo userInfo) {
        log.info("Update UserInfo By Id [{}].", userId);
        UserInfo updateUserInfo = userInfoService.updateUserInfo(userInfo);
        return ResultUtils.getSuccess(updateUserInfo);
    }

    @PostMapping()
    public Result<UserInfo> addUserInfo(UserInfo userInfo) {
        log.info("Add UserInfo.");
        final UserInfo addUserInfo = userInfoService.addUserInfo(userInfo);
        return ResultUtils.getSuccess(addUserInfo);
    }

    @ApiOperation(value = "获取 UserInfo", notes = "通过 Id 获取 UserInfo")
    @GetMapping(value = "{id}")
    public Result<UserInfo> getUserInfoById(@PathVariable(value = "id") Integer userId) {
        log.info("Get User By Id [{}].", userId);
        UserInfo userInfo = userInfoService.getUserInfoById(userId);
        return ResultUtils.getSuccess(userInfo);
    }

    @GetMapping(value = "")
    public Result<List<UserInfo>> getUserInfoList() {
        log.info("Get UserInfo List.");
        List<UserInfo> userInfoList = userInfoService.getUserInfo();
        return ResultUtils.getSuccess(userInfoList);
    }

}
