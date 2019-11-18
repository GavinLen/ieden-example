package xyz.ieden.spring.boot.example.common.constant;

import org.springframework.http.HttpStatus;

/**
 * Result 常量类
 *
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/10/25 0:11
 */
public interface ResultConstant {

    /**
     * 未知错误 Code
     */
    Integer UNKNOWN_ERROR_CODE = 999;
    /**
     * 未知错误 Msg
     */
    String UNKNOWN_ERROR_MSG = "未知错误";
    /**
     * 未登录 Code
     */
    Integer NOT_LOGIN_CODE = 888;
    /**
     * 未登录 Msg
     */
    String NOT_LOGIN_MSG = "未登录";

    /**
     * Success Code
     */
    Integer SUCCESS_CODE = HttpStatus.OK.value();
    /**
     * Success Msg
     */
    String SUCCESS_MSG = "success";
    /**
     * 服务错误 Code
     */
    Integer SERVICE_ERROR_CODE = HttpStatus.INTERNAL_SERVER_ERROR.value();
    /**
     * 服务错误 Msg
     */
    String SERVICE_ERROR_MSG = "系统出现异常";
    /**
     * 服务器错误友好 MSG
     */
    String SERVICE_ERROR_AMITY_MSG = "服务器忙请稍后再试";

    /**
     * 参数错误 Code
     */
    Integer PARAMETER_ERROR_CODE = HttpStatus.PRECONDITION_FAILED.value();
    /**
     * 参数错误 Msg
     */
    String PARAMETER_ERROR_MSG = "请求参数不合法";

    /**
     * 不允许 Code
     */
    Integer FORBIDDEN_CODE = HttpStatus.FORBIDDEN.value();
    /**
     * 不允许 Msg
     */
    String FORBIDDEN_MSG = "权限不足";
}
