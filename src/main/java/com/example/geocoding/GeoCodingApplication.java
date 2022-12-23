package com.example.geocoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
public class GeoCodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoCodingApplication.class, args);
    }

}
