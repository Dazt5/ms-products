package com.dazt.products.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ProductTest.
 *
 * @author David Alvarez.
 * @version 1.0.0, 20-09-2022
 */
class ProductTest {

    @Test
    void testGetters(){
        final var product = new Product();
        product.setId(BigInteger.ONE);
        product.setName("productName");
        product.setDescription("productDescription");
        product.setStock(1);
        product.setPrice(BigDecimal.ONE);
        product.setCreateTime(LocalDateTime.now(ZoneId.systemDefault()));
        product.setUpdateTime(LocalDateTime.now(ZoneId.systemDefault()));
        Assertions.assertNotNull(product.getId());
        Assertions.assertNotNull(product.getName());
        Assertions.assertNotNull(product.getDescription());
        Assertions.assertNotNull(product.getStock());
        Assertions.assertNotNull(product.getPrice());
        Assertions.assertNotNull(product.getCreateTime());
        Assertions.assertNotNull(product.getUpdateTime());
    }

    @Test
    void testConstructors(){
        final var product = new Product();
        Assertions.assertNotNull(product);
    }

    @Test
    void testBuilder(){
        final var product = Product.builder()
            .id(BigInteger.ONE)
            .name("productName")
            .description("productDescription")
            .stock(1)
            .price(BigDecimal.ONE)
            .createTime(LocalDateTime.now(ZoneId.systemDefault()))
            .updateTime(LocalDateTime.now(ZoneId.systemDefault()))
            .build();
        Assertions.assertNotNull(product.getId());
        Assertions.assertNotNull(product.getName());
        Assertions.assertNotNull(product.getDescription());
        Assertions.assertNotNull(product.getStock());
        Assertions.assertNotNull(product.getPrice());
        Assertions.assertNotNull(product.getCreateTime());
        Assertions.assertNotNull(product.getUpdateTime());
    }

}