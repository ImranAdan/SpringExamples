package org.adani.spring.examples.data.templates.model;

import java.math.BigDecimal;

public class Product {

    private final int id;
    private final String name;

    private BigDecimal price;
    private int quantity;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.price = product.price;
        this.quantity = product.quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int amount) {
        this.quantity = amount;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
