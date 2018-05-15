package com.project02.main.controller;

import com.project02.main.service.ShoppingCartService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShopCartPageController {

    private static final Logger logger = LogManager.getLogger(ShopCartPageController.class);

    @Autowired
    ShoppingCartService shoppingCartService;


}
