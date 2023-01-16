package com.example.restapi.service;

import com.example.restapi.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> listAll();
    void save(Product product);
    Product getProductById(Long id);
    void delete(Long id);
}
