package com.sls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sls
 **/
@RestController
public class DemoController {

    @GetMapping("test2")
    public String test2() throws InterruptedException {
        // 设置线程休眠时间
        Thread.sleep(1000);
        return "ok";
    }
}
