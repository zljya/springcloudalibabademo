package com.cxq.stock.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/reduce")
    public String reduce(){
        System.out.println("减少库存");
        return "库存减少成功";
    }
}
