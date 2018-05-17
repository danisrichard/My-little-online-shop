package com.project02.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderConfirmationPageController {

    @GetMapping("/order-confirmation")
    public String confirmationPage(){
        return null;
    }
}
