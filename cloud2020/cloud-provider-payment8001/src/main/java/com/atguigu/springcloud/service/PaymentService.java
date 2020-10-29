package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description: 支付实现类接口
 * @author: jzm
 * @create: 2020-10-26 22:48
 **/
public interface PaymentService {

    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}






