package com.cxq.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    //使用IP调用
    @Bean
    public RestTemplate commonRestTemplate(RestTemplateBuilder builder){
        //Builder模式，官方推荐这样构造template
        RestTemplate commonRestTemplate = builder.build();
        return commonRestTemplate;
    }
    //使用服务名字调用
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        //Builder模式，官方推荐这样构造template
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }

}
