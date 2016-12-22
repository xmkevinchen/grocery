package com.ckai.grocery.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Kevin Chen
 *         Created: 12/22/16
 */

@SpringBootApplication
@EnableConfigServer
public class GroceryConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroceryConfigServerApplication.class);
    }
}
