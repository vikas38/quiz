package com.vikas.tyk.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {

    @Bean
    public Docket projectApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("TYK Api")
                .version("1.0.0")
                .description("Web service Api for personal blog-app")
                .contact(new Contact("Vikas Pandey" , "https://vikas38.github.io/me/", "vikas38@aol.com"))
                .build();
    }



}