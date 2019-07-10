package com.sls.service;

import cn.gjing.HttpClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * @author sls
 **/
@Service
public class TestService {

    // 此注解说明该方法要执行回退， fallback指定回退方法
    @HystrixCommand(fallbackMethod = "defaultFallback")
    public String hello() {
        HttpClient httpClient = new HttpClient();
        return httpClient.get("http://127.0.0.1:8082/test2", String.class);
    }

    // 回退方法
    public String defaultFallback() {
        return "no heelo";
    }
}
