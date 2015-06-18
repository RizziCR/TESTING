package de.rizzicr.testing.springfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by rizzi on 26.05.15.
 */
@SpringBootApplication
@ComponentScan(basePackages = "de.rizzicr.testing.springfox")
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket profilerApi() {
        //@formatter:off
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo-api")
                .select()
                    .apis(RequestHandlerSelectors.basePackage("de.rizzicr.testing.springfox"))
                    .paths(PathSelectors.any())
                    .build();
        //@formatter:on
    }

    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration("validatorUrl");
    }

}
