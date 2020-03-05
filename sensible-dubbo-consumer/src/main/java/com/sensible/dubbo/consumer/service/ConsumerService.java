package com.sensible.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sensible.dubbo.api.LeaguerRegisterService;
import org.springframework.stereotype.Component;

/**
 * @author liuyc
 * @Description: 消费者服务类
 * @date 2020/3/4 000418:05
 */
@Component
public class ConsumerService {
    @Reference
    private LeaguerRegisterService leaguerRegisterService;

    public String doRegist(String name,String phone){
        return leaguerRegisterService.regist(name,phone);
    }
}
