package com.project02.main.controller;

import com.project02.main.entity.OrderEntity;
import com.project02.main.service.OrderTrackService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class OrderTrackPageController {

    private static final Logger logger = LogManager.getLogger(OrderTrackPageController.class);

    @Autowired
    OrderTrackService orderTrackService;

    @GetMapping("/ordertrack")
    public String findOrder(@PathVariable long orderId){

        List<OrderEntity> productList = orderTrackService.getProductsByID(orderId);

        return "item-section/find-order";
    }

    @GetMapping("/deleteorder")
    public String deleteOrder(@PathVariable long orderId){

        return null;
    }
}
