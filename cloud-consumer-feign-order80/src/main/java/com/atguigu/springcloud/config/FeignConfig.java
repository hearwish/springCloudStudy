package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/11 3:01 下午
 * @Version 1.0
 */
@Configuration
public class FeignConfig {

    //设置feign日志级别
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
