package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName OrderEurekaMain80
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/10 10:28 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
//添加引入自定义负载均衡规则类
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderEurekaMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderEurekaMain80.class, args);
    }

}
