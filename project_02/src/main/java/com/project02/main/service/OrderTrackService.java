package com.project02.main.service;

import com.project02.main.entity.OrderEntity;
import com.project02.main.entity.Product;
import com.project02.main.entity.User;

import java.util.HashMap;
import java.util.Optional;

public interface OrderTrackService {

    Optional<OrderEntity> getProductsByID(Long orderId);

    void deleteOrder(Long orderId);

    OrderEntity generateOrderCode(HashMap<Product,Integer> listOfOrders,User user);

}
