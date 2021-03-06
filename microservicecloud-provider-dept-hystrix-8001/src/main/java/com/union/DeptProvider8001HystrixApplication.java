package com.union;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 12:21
 */
@SpringBootApplication
@EnableEurekaClient     //本服务启动后，会自动注册进eureka服务中
@EnableDiscoveryClient  //服务发现

public class DeptProvider8001HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001HystrixApplication.class, args);
    }
}
