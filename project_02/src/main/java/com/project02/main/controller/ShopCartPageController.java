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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopCartPageController {

    private static final Logger logger = LogManager.getLogger(ShopCartPageController.class);

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private ProductService productService;

    @GetMapping("/shop-cart-element")
    public String shoppingCart(Model model) {

        model.addAttribute("shopProducts", shoppingCartService.getAllProductsInCart());

        /*
        Map<Product, Integer> listofProducts = shoppingCartService.getAllProductsInCart();
        Stream.of(listofProducts.toString()).forEach(System.out::println);
        */

        model.addAttribute("totalValue", shoppingCartService.getTotalProductsValue());

        return "shop-cart-section/shop-cart";
    }

    @RequestMapping(value = "/shoppingcart/addProductItem/{id}", method = RequestMethod.GET)
    public String addProductToCart(@PathVariable Long id) {

        logger.info("productID: addtoCart: " + id);

        productService.findProductById(id).ifPresent(shoppingCartService::addProductToCart);
        return "redirect:/home";
    }

    @RequestMapping(value = "/shoppingcart/removeProductItem/{id}", method = RequestMethod.GET)
    public String removeProductFromCart(@PathVariable Long id) {

        logger.info("productID: removeFromCart: " + id);

        productService.findProductById(id).ifPresent(shoppingCartService::removeProductFromCart);

        return "redirect:/shop-cart-element";
    }
}
