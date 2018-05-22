package com.project02.main.service.impl;

import com.project02.main.dao.ProductRepository;
import com.project02.main.entity.Product;
import com.project02.main.service.ShoppingCartService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.context.annotation.ScopedProxyMode.*;
import static org.springframework.web.context.WebApplicationContext.*;

@Service
@Scope(value = SCOPE_SESSION,proxyMode = TARGET_CLASS)
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private static final Logger logger = LogManager.getLogger(ShoppingCartServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;

    private final Map<Product, Integer> productListMap = new HashMap<>();

    @Override
    public void addProductToCart(Product product) {

        logger.info("---> addProductToCart " + product.getName() + " - " + product.getId());

        if (productListMap.containsKey(product)) {
            productListMap.replace(product, productListMap.get(product) + 1);
        } else {
            productListMap.put(product, 1);
        }
    }

    @Override
    public void removeProductFromCart(Product product) {
        if(productListMap.containsKey(product)){
            if(productListMap.get(product) > 1){
                productListMap.replace(product,productListMap.get(product) -1);
            }else{
                productListMap.remove(product);
            }
        }
    }

    @Override
    public Map<Product, Integer> getAllProductsInCart() {
        return Collections.unmodifiableMap(productListMap);
    }

    @Override
    public BigDecimal getTotalProductsValue() {
        return productListMap.entrySet().stream()
                .map(e -> e.getKey().getPrice().multiply(BigDecimal.valueOf(e.getValue())))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    @Override
    public void incrementProductQuantity(Product product,int quantity) {
        if(productListMap.containsKey(product)){
            if(productRepository.getOne(product.getId()).getQuantity() <= quantity){
                productListMap.replace(product,quantity);
            }
        }
    }

}
