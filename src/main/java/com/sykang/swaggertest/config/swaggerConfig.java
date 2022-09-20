package com.sykang.swaggertest.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
public class swaggerConfig {

    @Bean
    public OpenAPI openAPI(@Value("${springdoc.version}") String appVersion) {
        Info info = new Info().title("API Docs").version(appVersion)
                .description("Spring Boot를 이용한 Demo 웹 애플리케이션 API.")
                .termsOfService("http://swagger.io/terms/")
                .contact(new Contact().name("sykang").email("sykang@mz.co.kr"))
                .license(new License().name("Apache License Version 2.0").url("http://www.apache.org/licenses/LICENSE-2.0"));

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }

    /*@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any()) // 특정 패키지경로를 API문서화 한다. 1차 필터
                .paths(PathSelectors.any()) // apis중에서 특정 path조건 API만 문서화 하는 2차 필터
                .build()
                .groupName("API 1.0.0") // group별 명칭을 주어야 한다.
                .pathMapping("/")
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false); // 400,404,500 .. 표기를 ui에서 삭제한다.
    }

    @Bean
    public Docket cwApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any()) // 특정 패키지경로를 API문서화 한다. 1차 필터
                .paths( PathSelectors.regex("/cw.*")) // apis중에서 특정 path조건 API만 문서화 하는 2차 필터
                .build()
                .groupName("CloudWatch") // group별 명칭을 주어야 한다.
                .pathMapping("/cw/")
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false); // 400,404,500 .. 표기를 ui에서 삭제한다.
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API TEST 프로젝트")
                .description("API Test")
                .version("1.0.0")
                .termsOfServiceUrl("")
//                .contact()
                .license("")
                .licenseUrl("")
                .build();
    }*/
}
