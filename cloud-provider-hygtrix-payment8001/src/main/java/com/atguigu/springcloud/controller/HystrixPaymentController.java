package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HystrixPaymentController
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/11 4:34 下午
 * @Version 1.0
 */
@RestController
@Slf4j
public class HystrixPaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hystirx/payment/ok/{id}")
    public String getPayment_ok(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_of(id);
        return "port:"+serverPort+"\t"+"result:"+result;
    }

    @GetMapping("/hystirx/payment/timeout/{id}")
    public String getPayment_TimeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOut(id);
        return "port:"+serverPort+"\t"+"result:"+result;
    }
    //====服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("****result: "+result);
        return result;
    }

}
