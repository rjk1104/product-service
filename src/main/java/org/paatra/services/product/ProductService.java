package org.paatra.services.product;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product API", version = "1.0.0"))
public class ProductService {
    public static void main(String[] args){
        SpringApplication.run(ProductService.class, args);
    }
}
