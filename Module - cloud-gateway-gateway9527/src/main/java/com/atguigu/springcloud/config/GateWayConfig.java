package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GateWayConfig
 * @Description TODO
 * @Author yzy
 * @Date 2021/11/13 2:13 上午
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        //获取路由
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //访问localhost:9527/guonei 转发到http://news.baidu.com/guonei
        routes.route("path_route_atguigu",//路由id 此路由的名字
                r -> r.path("/guonei").uri("https://blog.csdn.net/")).build();
        return routes.build();
    }

    //@Bean
    //public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
    //    //获取路由
    //    RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
    //    //访问localhost:9527/guonei 转发到http://news.baidu.com/guonei
    //    routes.route("path_route_to_bing",
    //            r -> r.path("/tobing").uri("http://news.baidu.com/guonei")).build();
    //    return routes.build();
    //}
    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu2",
                r -> r.path("/guowai").uri("https://blog.csdn.net/")).build();

        return routes.build();
    }
}
