package com.sensible.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.sensible.dubbo.consumer.service.ConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SensibleDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SensibleDubboConsumerApplication.class, args);
    }

}
