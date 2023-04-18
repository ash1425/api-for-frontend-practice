package com.ashay.practice.productapi.domain;

import java.math.BigDecimal;
import java.time.Instant;

public class Product {

    private final String productCode;
    private final String sku;
    private final String colour;
    private final Size size;
    private final BigDecimal price;
    private final Instant deliveryDate;
    private final int stock;

    private final String image;

    public Product(String productCode, String sku, String colour, Size size, BigDecimal price, Instant deliveryDate, int stock, String image) {
        this.productCode = productCode;
        this.sku = sku;
        this.colour = colour;
        this.size = size;
        this.price = price;
        this.deliveryDate = deliveryDate;
        this.stock = stock;
        this.image = image;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getSku() {
        return sku;
    }

    public String getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Instant getDeliveryDate() {
        return deliveryDate;
    }

    public int getStock() {
        return stock;
    }

    public String getImage() {
        return image;
    }
}

