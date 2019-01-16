package org.citi.codi.example.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ExampleConfig {
	
    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("api-example")
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDateTime.class, Date.class)
                .select()
                .paths(regex("/hello.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Example Doc Api")
                .description("Domunetation of API")
                .termsOfServiceUrl("http://en.wikipedia.org/wiki/Terms_of_service")
                .contact("jovannijuarez601@gmail.com")
                .license("Apache License Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("2.0")
                .build();
    }
}
