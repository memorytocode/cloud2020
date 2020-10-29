package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: 支付控制层
 * @author: jzm
 * @create: 2020-10-26 22:53
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        if (i > 0) {
            return new CommonResult(200, "数据插入成功", i);
        } else {
            return new CommonResult(444, "数据插入失败", null);
        }

    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById != null) {
            return new CommonResult(200, "数据查询成功", paymentById);
        } else {
            return new CommonResult(444, "数据查询失败", null);
        }

    }

}






