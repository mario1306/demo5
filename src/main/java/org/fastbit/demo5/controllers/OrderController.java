package org.fastbit.demo5.controllers;

import org.fastbit.demo5.services.OrderHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

  @Autowired
  private OrderHeadService orderHeadService;

  @RequestMapping("/")
  public String getOrders(Model model){
    model.addAttribute("orders", orderHeadService.getOrders());
    return "orders";
  }
}
