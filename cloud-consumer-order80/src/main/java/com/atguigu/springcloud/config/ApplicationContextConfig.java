package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther yzy
 * @create 2020-02-19 15:20
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    //@LoadBalanced //开启restTemplate负载均衡
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
