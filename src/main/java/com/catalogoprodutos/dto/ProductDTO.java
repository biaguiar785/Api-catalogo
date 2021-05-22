package com.catalogoprodutos.dto;
import java.math.BigDecimal;

import com.catalogoprodutos.model.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    public Product update(Product product) {
        product.setName(this.name);
        product.setPrice(this.price);
        product.setDescription(this.description);
        return product;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
}