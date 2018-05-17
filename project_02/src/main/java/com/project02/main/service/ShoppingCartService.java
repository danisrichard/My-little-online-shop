package com.project02.main.service;

import com.project02.main.entity.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProductToCart(Product product);

    void removeProductFromCart(Product product);

    Map<Product, Integer> getAllProductsInCart();

    BigDecimal getTotalProductsValue();

    void incrementProductQuantity(Product product, int quanity);
}
