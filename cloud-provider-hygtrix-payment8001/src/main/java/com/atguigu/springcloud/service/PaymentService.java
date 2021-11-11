package com.atguigu.springcloud.service;

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
    public String paymentInfo_TimeOut(Integer id){
        try{
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： "+Thread.currentThread().getName()+"paymentInfo_TimeOut,id:"+id;

    }
}
