package com.tardin.todo_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.tardin.todo_app";
    private static final String API_TITLE = "To Do App API";
    private static final String REPOSITORY_URL = "https://github.com/8rux40/todo-app";
    private static final String API_DESCRIPTION = "Simple project for practice Spring + MongoDB. See more: " + REPOSITORY_URL;
    private static final String API_VERSION = "1.0.0";
    private static final String CONTACT_NAME = "Bruno Tardin";
    private static final String CONTACT_GITHUB = "https://github.com/8rux40";
    private static final String CONTACT_EMAIL = "brunotardin20@gmail.com";

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build().apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version(API_VERSION)
                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
                .build();
    }
}
