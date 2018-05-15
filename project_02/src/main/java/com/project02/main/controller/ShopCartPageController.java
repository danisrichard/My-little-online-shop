package com.project02.main.controller;

import com.project02.main.service.ProductService;
import com.project02.main.service.ShoppingCartService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShopCartPageController {

    private static final Logger logger = LogManager.getLogger(ShopCartPageController.class);

    @Autowired
    private ShoppingCartService shoppingCartService;



    @Autowired
    private ProductService productService;

    @GetMapping("/shoppingcart")
    public String shoppingCart(Model model){
        model.addAttribute("shopProducts", shoppingCartService.getProductsInCart());

        return null;
    }

    @GetMapping("/addProductItem")
    public String addProductToCart(@PathVariable("itemId") long id){

        shoppingCartService.addProduct(id);
        return null;
    }

    @GetMapping("/removeProductItem")
    public String removeProductFromCart(@PathVariable("itemId") long id){

        shoppingCartService.removeProduct(id);
        return null;
    }
}
