package com.codecool.springdependencyinjection;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
            public void test () {
        //given
        ProductService productService = new ProductService(new ProductDiscountApplier());
        BigDecimal price = productService.getProductAfterDiscount().getPrice();
        //when

        Product productAfterDiscount = productService.getProductAfterDiscount();

        //then
        assertTrue(productAfterDiscount.getPrice().compareTo(price)<0);

    }
}