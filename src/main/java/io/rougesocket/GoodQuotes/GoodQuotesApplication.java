package io.rougesocket.GoodQuotes;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "GoodQuotes API",
				version = "1.0",
				description = "API for retrieving quotes"
		)
)
public class GoodQuotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodQuotesApplication.class, args);
	}

}
