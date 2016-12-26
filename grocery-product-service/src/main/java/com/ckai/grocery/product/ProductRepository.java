package com.ckai.grocery.product;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Kevin Chen
 *         CreatedAt 12/24/16
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
