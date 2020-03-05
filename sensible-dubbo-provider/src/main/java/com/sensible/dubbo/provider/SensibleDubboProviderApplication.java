package com.sensible.dubbo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @EnableDubboConfiguration 表示要开启dubbo功能
 */
@SpringBootApplication
@EnableDubboConfiguration
public class SensibleDubboProviderApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(SensibleDubboProviderApplication.class, args);
    }

}
