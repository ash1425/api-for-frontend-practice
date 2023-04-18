package com.ashay.practice.productapi.service;

import com.ashay.practice.productapi.domain.Product;
import com.ashay.practice.productapi.domain.Size;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.valueOf;

@Service
public class ProductDataService {

    private final List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        // Add some initial data
        products.add(new Product("P1", "Sku1", "#fff", Size.S, valueOf(22.23), Instant.now(), 100, "https://assets.myntassets.com/h_720,q_90,w_540/v1/assets/images/21926408/2023/2/10/84eeff94-0f7b-4e84-ba04-e6c721dac7cf1676048828425RedTapeMenBeigeTexturedSneakers1.jpg"));
        products.add(new Product("P1", "Sku2", "#fff323", Size.L, valueOf(22.23), Instant.now(), 100, "https://assets.myntassets.com/h_1440,q_90,w_1080/v1/assets/images/21926408/2023/2/10/3b6324f7-6cab-47bd-b140-a97a03674fe21676048828388RedTapeMenBeigeTexturedSneakers2.jpg"));
        products.add(new Product("P2", "Sku3", "#000", Size.U, valueOf(92.09), Instant.now().minus(5, ChronoUnit.DAYS), 10, "https://assets.myntassets.com/h_720,q_90,w_540/v1/assets/images/productimage/2021/6/2/004a4b6e-67cf-4e70-83c2-cd773d29d44a1622618094654-1.jpg"));
    }

    public List<Product> getProducts() {
        return products;
    }
}
