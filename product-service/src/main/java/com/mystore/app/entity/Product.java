package com.mystore.app.entity;

import jakarta.validation.constraints.*;

public class Product {

    private Integer id;

    @NotBlank
    @NotEmpty
    @NotNull
    private String name;

    @NotBlank
    @NotEmpty
    @NotNull
    private String category;

    @Positive
    @Min(value = 10, message = "Please don't add any product with price lesser than 10")
    @Max(value = 100000, message = "This platform doesn't allow high priced products. Prices must be <= 100000 ")
    private Double price;

    @Positive
    @Min(10)
    @Max(500)
    private Integer stockQuantity;

    public Product() {
    }

    public Product(Integer id, String name, String category, Double price, Integer stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}

