package com.panda.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.panda.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by xiongyong on 2017/11/3.
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    //@Autowired
    @Reference(interfaceName = "com.panda.service.IOrderService", version = "1.0.0")
    private IOrderService orderService;

    @GetMapping("/list/all")
    public Object listAll() {
        return orderService.listAll();
    }
}
