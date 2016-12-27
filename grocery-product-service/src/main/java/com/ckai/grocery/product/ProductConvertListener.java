package com.ckai.grocery.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

/**
 * @author Kevin Chen
 *         CreatedAt: 12/24/16
 */
@Component
public class ProductConvertListener extends AbstractMongoEventListener<Product> {

    @Autowired
    private ProductRepository repository;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Product> event) {

        if (event.getSource().getId() != null) {
            Product po = repository.findOne(event.getSource().getId());
            if (po != null) {
                event.getSource().setCreatedAt(po.getCreatedAt());
            }
        }

    }
}
