package com.atguigu.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/10 7:09 下午
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {


    @Bean
    @LoadBalanced//开启restTemplate负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
