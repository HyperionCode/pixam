package com.greenfox.pixam.controllers;

import com.greenfox.pixam.services.OrderService;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {


    private OrderService orderService;
    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }
}
