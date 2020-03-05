package com.sensible.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.sensible.dubbo.api.LeaguerRegisterService;
import org.springframework.stereotype.Component;

/**
 * @author liuyc
 * @Description:
 * @date 2020/3/4 000416:39
 */
@Service(interfaceClass = LeaguerRegisterService.class)
@Component
public class LeaguerService implements LeaguerRegisterService {
    @Override
    public String regist(String userName, String phone) {
        return  "用户名："+userName+",手机号："+phone+"注册成功！";
    }
}
