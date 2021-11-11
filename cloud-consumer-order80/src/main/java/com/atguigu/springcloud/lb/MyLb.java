package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLb
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/11 12:00 上午
 * @Version 1.0
 */
@Component
public class MyLb implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public final int getAndIncrement(){

        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("***第几次访问，次数next: ***"+next);
        return next;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }




    //private int incrementAndGetModulo(int modulo) {
    //    for (;;) {
    //        int current = atomicInteger.get();
    //        int next = (current + 1) % modulo;
    //        if (atomicInteger.compareAndSet(current, next))
    //            return next;
    //    }
    //}
}
