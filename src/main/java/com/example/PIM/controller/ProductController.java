package com.example.PIM.controller;

import com.example.PIM.model.Product;
import com.example.PIM.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping(value = "/{product_id}")
    public Optional<Product> getProductDetails(@PathVariable Integer product_id){
        return productService.getProductDetail(product_id);
    }
    @PostMapping(value = "/create")
    public void save(Product newProduct){
        productService.save(newProduct);
    }
    @DeleteMapping(value =  "delete/{product_id}")
    public void deleteProduct(@PathVariable Integer product_id){
        productService.delete(product_id);
    }
}

