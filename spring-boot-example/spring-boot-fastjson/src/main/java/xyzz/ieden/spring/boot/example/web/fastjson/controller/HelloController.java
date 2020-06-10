package xyzz.ieden.spring.boot.example.web.fastjson.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/5/27 13:41
 */
@Slf4j
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping(value = "user")
    public String testReqArray(User user) {
        log.info("UserInfo:{}", ToStringBuilder.reflectionToString(user, ToStringStyle.JSON_STYLE));
        return "success";
    }

}

@Getter
@Setter
class User {
    private Long userId;
    private String[] tagArr;
}
