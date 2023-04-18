package com.ashay.practice.productapi.api;

import com.ashay.practice.productapi.domain.Product;
import com.ashay.practice.productapi.service.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductApi {

    private final ProductDataService productDataService;

    @Autowired
    public ProductApi(ProductDataService productDataService) {
        this.productDataService = productDataService;
    }

    @GetMapping(value = "/products", produces = "application/json")
    public List<Product> products() {
        return productDataService.getProducts();
    }
}
