package com.atguigu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrederZKController
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/10 7:10 下午
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrederZKController {
    public static final String INVOKE_URL = "http://cloud-provider-payment-zk";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }
}
