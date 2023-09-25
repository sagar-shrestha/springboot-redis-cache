package com.example.springbootrediscache.service;

import com.example.springbootrediscache.entity.Product;
import com.example.springbootrediscache.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    public final ProductRepository productRepository;
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }


    public Object findProductById(Integer id) {
        return productRepository.findById(id);
    }

    public String deleteProductById(Integer id) {
        productRepository.deleteById(id);
        return "Product deleted";
    }
}
