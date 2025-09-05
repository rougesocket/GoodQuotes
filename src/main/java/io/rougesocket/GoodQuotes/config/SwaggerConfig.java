package io.rougesocket.GoodQuotes.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {


    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("GoodQuotes").description("A simple RESTful API for managing inspirational quotes, built with Spring Boot and MongoDB Atlas.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Bhaskar Singh")  // your name
                                .url("https://www.linkedin.com/bhaskarsanjaysingh")
                                .email("bhaskarsingh1404@gmail.com")
                        ));
    }
}
