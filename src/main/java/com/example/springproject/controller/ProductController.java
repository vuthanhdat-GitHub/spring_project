package com.example.springproject.controller;

import com.example.springproject.entity.ProductEntity;
import com.example.springproject.repository.ProductRepository;
import com.example.springproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:5050")
@RestController
@RequestMapping("/product")
public class ProductController  {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductService productService;

    @RequestMapping("/getAllProduct")
    public @ResponseBody List<ProductEntity> getAllProducts() {
        return productService.getAllProduct();
    }

    @RequestMapping("/add")
    public String addProduct(Model model){
        model.addAttribute("product", new ProductEntity());
        return "addProduct";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editProduct(@RequestParam("id") Long ProductId, Model model){
        Optional<ProductEntity> editProduct = productService.findProductById(ProductId);
        editProduct.ifPresent(productEntity -> model.addAttribute("product", productEntity));
        return "editProduct";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam("id") Long productId, Model model){
        productService.deleteProduct(productId);
        return "deleteProduct";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(ProductEntity productEntity) {
        productService.saveProduct(productEntity);
        return "save";
    }
}
