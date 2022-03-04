package com.tardin.todo_app.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private static final String API_TITLE = "To Do App API";
    private static final String REPOSITORY_URL = "https://github.com/8rux40/todo-app";
    private static final String API_DESCRIPTION = "Simple project for practice Spring + MongoDB. See more: " + REPOSITORY_URL;
    private static final String API_VERSION = "v0.0.1";
    private static final String CONTACT_NAME = "Bruno Tardin";
    private static final String CONTACT_GITHUB = "https://github.com/8rux40";
    private static final String CONTACT_EMAIL = "brunotardin20@gmail.com";

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info().title(API_TITLE)
                        .description(API_DESCRIPTION)
                        .version(API_VERSION)
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                .contact(new Contact()
                        .name(CONTACT_NAME)
                        .url(CONTACT_GITHUB)
                        .email(CONTACT_EMAIL)));
    }
}
