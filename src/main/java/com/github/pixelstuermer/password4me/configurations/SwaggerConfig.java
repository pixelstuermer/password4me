package com.github.pixelstuermer.password4me.configurations;

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
   public Docket swaggerApi() {
      return new Docket( DocumentationType.SWAGGER_2 ).select()
         .apis( RequestHandlerSelectors.any() )
         .paths( PathSelectors.any() )
         .build()
         .apiInfo( getSwaggerMetaData() );
   }

   @SuppressWarnings( "deprecation" )
   private ApiInfo getSwaggerMetaData() {
      ApiInfo apiInfo = new ApiInfo( "password4me", "Generates passwords according to user input parameters",
         "1.0.0-SNAPSHOT", "https://raw.githubusercontent.com/pixelstuermer/password4me/master/LICENSE",
         "https://github.com/pixelstuermer", "MIT License",
         "https://raw.githubusercontent.com/pixelstuermer/password4me/master/LICENSE" );
      return apiInfo;
   }

}
