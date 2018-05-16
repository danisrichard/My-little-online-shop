package com.project02.main.service;

import com.project02.main.entity.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    BigDecimal getTotal();

    void incrementProductQuantity(Product product, int quanity);
}
