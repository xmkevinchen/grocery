package com.ckai.grocery.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Kevin Chen
 * @since 12/24/16
 */
@RestController
public class ProductRestController {

    @Autowired
    private ProductService service;

    @RequestMapping("/products")
    public List<Product> products() {
        return service.getProducts();
    }

    @RequestMapping("/product/{productId}")
    public Product get(@PathVariable String productId) {
        return service.get(productId);
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.PUT)
    public Product update(@RequestBody Product product, @PathVariable String productId) {
        if (!productId.equals(product.getId())) {
            throw new RuntimeException();
        }

        return service.update(product);
    }

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String productId) {
        service.delete(productId);
    }
}
