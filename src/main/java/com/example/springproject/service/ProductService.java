package com.example.springproject.service;

import com.example.springproject.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> getAllProduct();

    void saveProduct(ProductEntity productEntity);

    void deleteProduct(Long id);

    Optional<ProductEntity> findProductById(Long id);
}
