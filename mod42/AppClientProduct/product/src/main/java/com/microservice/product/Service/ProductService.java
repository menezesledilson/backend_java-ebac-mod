package com.microservice.product.Service;


import com.microservice.product.Model.Product;
import com.microservice.product.repositorie.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findProduct() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
       return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
         return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
