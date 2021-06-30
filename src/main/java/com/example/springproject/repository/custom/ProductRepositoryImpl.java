//package com.example.springproject.repository.impl;
//
//import com.example.springproject.entity.ProductEntity;
//import com.example.springproject.repository.ProductRepository;
//import org.springframework.data.domain.Pageable;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//import java.util.Map;
//
//public class ProductRepositoryImpl implements ProductRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<ProductEntity> findAllProductEntities(Map<String, Object> properties, Pageable pageable){
//        StringBuilder sql = new StringBuilder();
//        sql.append("SELECT ");
//        sql.append(" * ");
//        sql.append(" FROM ");
//        sql.append(" product;");
//        return this.
//    }
//}
