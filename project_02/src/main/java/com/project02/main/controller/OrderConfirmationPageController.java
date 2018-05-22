package com.project02.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderConfirmationPageController {

    @GetMapping("/order-confirmation")
    public String confirmationPage(){

        return "shop-confim-section/order-confirmation-site";
    }

    @GetMapping("/succes-order")
    public String succerOrderPage(Model model){

        model.addAttribute("generated-ordernumb",132);

        return null;
    }
}
