package com.ckai.grocery.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Kevin Chen
 *         Created: 12/22/16
 */
@SpringBootApplication
@EnableEurekaClient
public class GroceryProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroceryProductApplication.class);
    }
}
