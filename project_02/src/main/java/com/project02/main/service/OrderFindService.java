package com.project02.main.service;

import com.project02.main.entity.Product;

import java.util.List;

public interface OrderFindService {

    List<Product> getProductsByID(Long orderId);

    void deleteOrder(Long orderId);

}
