package com.example.springbootrediscache.controller;

import com.example.springbootrediscache.entity.Product;
import com.example.springbootrediscache.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/getallproduct")
    @Cacheable("Product")
    //     @Cacheable(key = "#id", value = "Product") for spring data as database
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable("Product")
    public Object findProductById(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable Integer id) {
        return productService.deleteProductById(id);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
