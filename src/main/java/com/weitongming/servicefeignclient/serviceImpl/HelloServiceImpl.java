package com.weitongming.servicefeignclient.serviceImpl;

import com.weitongming.servicefeignclient.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tim.wei on 2018/1/28.
 */
@RestController
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "I am service-feign-client";
    }
}
