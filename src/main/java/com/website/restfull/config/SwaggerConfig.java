package com.website.restfull.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.website.restfull.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Website",
                "An application to perform CURD operation in Websites",
                "Website CEO",
                "Terms of service",
                "tuturself@gmail.com",
                "License of API",
                "License URL");
        return apiInfo;
    }

}
