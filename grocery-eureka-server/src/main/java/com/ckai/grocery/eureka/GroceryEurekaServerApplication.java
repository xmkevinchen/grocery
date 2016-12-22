package com.ckai.grocery.eureka;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Kevin Chen
 *         Created: 12/22/16
 */
@SpringBootApplication
@EnableEurekaServer
public class GroceryEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GroceryEurekaServerApplication.class);
    }
}
