package org.example.main;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("MainServer API")
                        .version("1.0.0")
                        .description("API documentation.")
                        .contact(new Contact()
                                .name("Budaes Tanaru Riccardo Gabriele")
                                .email("riccardo.budaestanar@edu.unito.it")
                                .url("riccardo.budaestanar@edu.unito.it")
                        )
                );
    }
}
