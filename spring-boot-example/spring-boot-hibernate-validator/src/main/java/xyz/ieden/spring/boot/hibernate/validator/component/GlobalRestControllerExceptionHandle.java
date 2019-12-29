package xyz.ieden.spring.boot.hibernate.validator.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xyz.ieden.spring.boot.example.common.constant.ResultConstant;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.util.ResultUtils;

import javax.validation.ValidationException;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/12/23 19:27
 */
@Slf4j
@RestControllerAdvice
public class GlobalRestControllerExceptionHandle {

    @ExceptionHandler(value = {BindException.class, ValidationException.class})
    @ResponseStatus(HttpStatus.OK)
    public <T> Result<T> handleMethodArgumentNotValidException(Exception ex) {
        String message = ex.getMessage();
        log.error("Request Exception: Msg [{}].", message, ex);
        return ResultUtils.getResult(ResultConstant.UNKNOWN_ERROR_CODE, ResultConstant.UNKNOWN_ERROR_MSG);
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public <T> Result<T> handleException(Exception ex) {
        String message = ex.getMessage();
        log.error("Request Exception: Msg [{}].", message, ex);
        return ResultUtils.getResult(ResultConstant.UNKNOWN_ERROR_CODE, ResultConstant.UNKNOWN_ERROR_MSG);
    }
}
