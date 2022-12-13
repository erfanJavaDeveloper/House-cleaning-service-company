package com.example.house_cleaning_service_company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
//@EnableJpaRepositories
public class HouseCleaningServiceCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseCleaningServiceCompanyApplication.class, args);
    }

//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.swaggerdemo")).build();
//    }

}
