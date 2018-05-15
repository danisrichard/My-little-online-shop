package com.project02.main.service;

import com.project02.main.entity.OrderEntity;

import java.util.List;

public interface OrderTrackService {

    List<OrderEntity> getProductsByID(Long orderId);

    void deleteOrder(Long orderId);

}
