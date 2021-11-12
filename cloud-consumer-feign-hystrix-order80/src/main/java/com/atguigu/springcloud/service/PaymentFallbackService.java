package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PyamentFallbackService
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/12 12:02 下午
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PyamentFallbackService_ok fall back";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PyamentFallbackService_TimeOut fall back";
    }
}
