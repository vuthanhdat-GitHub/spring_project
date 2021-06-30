package com.example.springproject.service.impl;

import com.example.springproject.entity.ProductEntity;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProduct(){
        List<ProductEntity> list = (List<ProductEntity>) productRepository.findAll();
        return list;
    }

    @Override
    public void saveProduct(ProductEntity productEntity){
        productRepository.save(productEntity);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    @Override
    public Optional<ProductEntity> findProductById(Long id){
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        return productEntity;
    }
}
