package com.example.PIM.service;

import com.example.PIM.model.Product;
import com.example.PIM.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final IProductRepository productRepository;

    @Autowired
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductDetail(Integer id){
        return productRepository.findById(id);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }
    public void delete(Integer id){
        productRepository.deleteById(id);
    }
}
