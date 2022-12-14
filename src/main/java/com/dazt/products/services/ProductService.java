package com.dazt.products.services;

import com.dazt.ms.products.dto.ProductDto;
import com.dazt.products.entity.Product;
import java.util.List;

/**
 * ProductService.
 *
 * @author David Alvarez.
 * @version 1.0.0, 21-09-2022
 */
public interface ProductService {

    /**
     * Return a list of products.
     *
     * @return list {@link Product}
     * */
    List<ProductDto> getAll();

    /**
     * Return a product queried by id.
     *
     * @return product {@link Product}
     * */
    ProductDto getById(final String id);

    /**
     * Save a new product.
     *
     * @return list {@link Product}
     * */
    ProductDto save(final ProductDto product);

    /**
     * Update a existing product
     *
     * @return list {@link Product}
     * */
    ProductDto update(final String id, final ProductDto product);

    /**
     * Delete a product
     *
     * @return list {@link Boolean}
     * */
    Boolean delete(final String id);
}