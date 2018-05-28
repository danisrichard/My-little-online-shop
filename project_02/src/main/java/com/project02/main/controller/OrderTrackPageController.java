package com.project02.main.controller;

import com.project02.main.entity.OrderEntity;
import com.project02.main.service.OrderTrackService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class OrderTrackPageController {

    private static final Logger logger = LogManager.getLogger(OrderTrackPageController.class);

    @Autowired
    OrderTrackService orderTrackService;

    @GetMapping("/ordertrack")
    public String findOrder(Model model){

        /*
        Optional<OrderEntity> productList = orderTrackService.getProductsByID(orderId);

        if(productList.isPresent()){
            model.addAttribute("productList",productList);
        }
        model.addAttribute("message","Nincs ilyen rendelés ezen az azonosító alatt: " + orderId);
        */

        return "order-find-section/find-order";
    }

    @GetMapping("/deleteorder")
    public String deleteOrder(@PathVariable long orderId,Model model){

        if(!orderTrackService.getProductsByID(orderId).isPresent()){
            orderTrackService.deleteOrder(orderId);
            model.addAttribute("message","Sikeres törlés: " + orderId);
        }
        model.addAttribute("message","Sikertelen törlés: " + orderId);

        return "item-section/find-order";
    }
}
