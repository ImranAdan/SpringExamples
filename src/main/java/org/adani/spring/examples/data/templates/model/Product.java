package org.adani.spring.examples.data.templates.model;

import java.math.BigDecimal;

public class Product {

    private final int id;
    private final String name;
    private BigDecimal price;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
