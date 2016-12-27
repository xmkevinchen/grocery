package com.ckai.grocery.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Kevin Chen
 *         CreatedAt: 12/27/16
 */
@RestController
@RequestMapping("/api")
public class ProductRestController {

    private static Logger logger = LoggerFactory.getLogger(ProductRestController.class);

    private String serviceId = "product-service";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/products")
    public List<Product> getProducts() {

        ResponseEntity<List<Product>> response
                = restTemplate.exchange("http://{serviceId}/products",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {
                },
                serviceId);
        return response.getBody();
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product) {
        HttpEntity<Product> entity = new HttpEntity<>(product);
        ResponseEntity<Product> response
                = restTemplate.exchange("http://{serviceId}/product",
                HttpMethod.POST,
                entity,
                new ParameterizedTypeReference<Product>() {
                }, serviceId);
        return response.getBody();

    }

}

class Product {

    private String id;
    private String name;
    private String description;
    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}