package com.ckai.grocery.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Kevin Chen
 *         CreatedAt: 12/24/16
 */
@Component
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product get(String productId) {
        return repository.findOne(productId);
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public Product update(Product product) {
        return repository.save(product);
    }

    public void delete(String productId) {
        repository.delete(productId);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }
}
