package com.project02.main.service;

import com.project02.main.entity.OrderEntity;

import java.util.Optional;

public interface OrderTrackService {

    Optional<OrderEntity> getProductsByID(Long orderId);

    void deleteOrder(Long orderId);

}
