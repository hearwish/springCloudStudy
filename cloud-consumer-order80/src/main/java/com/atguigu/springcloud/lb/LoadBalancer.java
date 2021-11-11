package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/10 11:57 下午
 * @Version 1.0
 */

/**
 * 自定义负载均衡算法
 *
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);


}
