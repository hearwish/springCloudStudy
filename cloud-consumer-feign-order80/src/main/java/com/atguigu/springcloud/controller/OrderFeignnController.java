package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignnController
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/11 1:11 上午
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderFeignnController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/feignConsumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        CommonResult<Payment> paymentById = paymentFeignService.getPaymentById(id);
        return paymentById;
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        String s = paymentFeignService.paymentFeignTimeout();
        return s;
    }

    }
