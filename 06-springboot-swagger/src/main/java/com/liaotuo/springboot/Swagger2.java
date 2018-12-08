package com.liaotuo.springboot;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 18070959
 * @create 2018-12-08 2:16 PM
 * @desc Swagger配置类
 **/

/***
 * 通过@Configuration注解，让Spring来加载该类配置。再通过@EnableSwagger2注解来启用Swagger2。
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    /* 通过createRestApi函数创建Docket的Bean */
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.liaotuo.springboot.controller")).paths(PathSelectors.any()).build();
    }

    /* apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中） */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Springboot 集成Swagger2").description("github : https://github.com/liaotuo")
                .termsOfServiceUrl("https://github.com/liaotuo").contact("liaotuo").version("1.0").build();
    }

}