package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/11 4:29 下午
 * @Version 1.0
 */
@Service
public class PaymentService {

    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfo_of(Integer id){
        return "线程池： "+Thread.currentThread().getName()+"paymentInfo_of,id:"+id;
    }

    /**
     * 有运行错误
     * @param id
     * @return
     */
    //服务降级fallback
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            //规定3秒内走正常业务逻辑
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id){
        int a = 10/0;
        //出数学异常后不再走下面代码
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： "+Thread.currentThread().getName()+"8001paymentInfo_TimeOut,id:"+id;
    }

    //fallback的参数名和原业务逻辑一样
    public String paymentInfo_TimeOutHandler(Integer id){
        //此线程是Hystrix的
        return "服务降级方法fallback"+"线程池："+Thread.currentThread().getName();
    }
}
