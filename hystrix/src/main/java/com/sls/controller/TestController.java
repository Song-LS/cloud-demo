package com.sls.controller;

import com.sls.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sls
 **/
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @PostMapping("/test")
    public String test() {
        return testService.hello();
    }
}
