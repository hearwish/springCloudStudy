package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OpenFeignOrderMain80
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/11 1:02 上午
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignOrderMain80.class,args);
    }
}
