package com.codecool.springdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    // @Autowired field
    private final ProductDiscountApplier productDiscountApplier;

    //constructor
    public ProductService(ProductDiscountApplier productDiscountApplier) {

        this.productDiscountApplier = productDiscountApplier;
    }

//     @Autowired      setter
//    public void setProductDiscountApplier(ProductDiscountApplier productDiscountApplier) {
//        this.productDiscountApplier = productDiscountApplier;
//    }

    private final Product product = new Product(BigDecimal.valueOf(23.50));

    public Product getProductBeforeDiscount() {
        return product;
    }

    public Product getProductAfterDiscount() {

        return productDiscountApplier.applyDiscount(product);
    }
}
