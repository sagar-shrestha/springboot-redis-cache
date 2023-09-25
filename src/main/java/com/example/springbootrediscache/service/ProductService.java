package com.example.springbootrediscache.service;

import com.example.springbootrediscache.entity.Product;

import java.util.List;

public interface ProductService {

    public Product save(Product product);

    public List<Product> findAll();

    public Object findProductById(Integer id);

    public String deleteProductById(Integer id);
}
