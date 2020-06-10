package xyz.ieden.spring.boot.example.swagger.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/18 14:20
 */
//@Profile(value = {"test"})
//@ConditionalOnProperty(prefix = "swagger",value = {"enable"},havingValue = "true", matchIfMissing = true)
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enable:false}")
    private boolean enableSwagger;

    @Bean
    public Docket bookDocket() {
        Docket docket = getDocket();
        return docket.groupName("book")
                .apiInfo(bookApiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.regex(".*/book.*"))
                .build();
    }

    private ApiInfo bookApiInfo() {
        return new ApiInfoBuilder()
                .title("Book Api")
                .description("Book Description")
                .termsOfServiceUrl("")
                .contact(new Contact("", "", ""))
                .version("1.0")
                .build();
    }

    @Bean
    public Docket userInfoDocket() {
        final Docket docket = getDocket();
        return docket.groupName("user")
                .apiInfo(userInfoApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("xyz.ieden.spring.boot.example.swagger.user.controller"))
                .paths(PathSelectors.regex(".*/user.*"))
                .build();
    }

    private ApiInfo userInfoApiInfo() {
        return new ApiInfoBuilder()
                .title("UserIfo Api")
                .description("UserInfo Description")
                .termsOfServiceUrl("")
                .contact(new Contact("", "", ""))
                .version("1.0")
                .build();
    }

    private Docket getDocket() {
        final Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.enable(false);
        return docket;
    }

}
