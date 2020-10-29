package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: 支付业务实现类
 * @author: jzm
 * @create: 2020-10-26 22:49
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}






