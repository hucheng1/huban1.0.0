package com.dao;

import com.entity.Order;

public interface IOrder {

    //添加订单
    int insertOrder(Order order);
}
