package com.panda.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.panda.mapper.OrderMapper;
import com.panda.model.OrderExample;
import com.panda.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by xiongyong on 2017/11/3.
 */
@Service(interfaceName = "com.panda.service.IOrderService", timeout = 6000, version = "1.0.0", retries = 2)
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Object listAll() {
        return orderMapper.selectByExample(new OrderExample());
    }
}
