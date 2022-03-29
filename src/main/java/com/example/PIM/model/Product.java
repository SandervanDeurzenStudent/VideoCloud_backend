package com.example.PIM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer productId;
    public String productTitle;
    public String productDescription;
    public String productDescriptions;

    public Product() {
    }

    public Product(Integer productId, String productTitle, String productDescription, String productDescriptions) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productDescriptions = productDescription;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getProductDescriptions() {
        return productDescriptions;
    }

    public void setProductDescriptions(String productDescriptions) {
        this.productDescriptions = productDescriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productDescriptions='" + productDescriptions + '\'' +
                '}';
    }
}
