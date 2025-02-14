package dev.layseiras.larussoauto.documentation;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Larusso Auto",
                version = "1.0",
                description = "Documentação da API"
        )
)
public class SwaggerConfig {
}