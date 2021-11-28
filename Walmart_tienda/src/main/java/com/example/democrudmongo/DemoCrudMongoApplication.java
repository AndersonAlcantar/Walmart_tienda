package com.example.democrudmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
<<<<<<< HEAD
public class DemoCrudMongoApplication {
	@Bean
	 public Docket ProductsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
=======



public class DemoCrudMongoApplication {
	
	
	@Bean 

		public Docket proveedoresApi() { 
			return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
					.build();
	}
		
	
	
>>>>>>> 67f83d1fd043418ee74d7e909451edbd9c8989bf

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudMongoApplication.class, args);
	}

	

	
}
