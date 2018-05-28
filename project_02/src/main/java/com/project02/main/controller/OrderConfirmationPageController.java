package com.project02.main.controller;

import com.project02.main.entity.Product;
import com.project02.main.entity.User;
import com.project02.main.service.OrderTrackService;
import com.project02.main.service.ShoppingCartService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import java.util.HashMap;

@Controller
public class OrderConfirmationPageController {

    private static final Logger logger = LogManager.getLogger(OrderConfirmationPageController.class);

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private OrderTrackService orderTrackService;

    @GetMapping("/order-confirmation")
    public String confirmationPage(Model model){

        model.addAttribute("listOfProducts",shoppingCartService.getAllProductsInCart());

        return "shop-confirm-section/confirmation-site";
    }

    @GetMapping("/success-order")
    public String successOrderPage(Model model,@Valid User user){

        orderTrackService.generateOrderCode((HashMap<Product, Integer>) shoppingCartService.getAllProductsInCart(),user);
        model.addAttribute("generated-order",132);

        return null;
    }
}
