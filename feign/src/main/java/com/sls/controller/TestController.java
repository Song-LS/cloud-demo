package com.sls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sls
 **/
@RestController
public class TestController {

    @GetMapping("/test6")
    public Map<String, Object> test6() {
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("code", "ok");
        return map;
    }

    @GetMapping("test7")
    public String test7(@RequestParam(name =  "param1")String param1) {
        return param1;
    }

    @PostMapping("/test8")
    public Integer test8(Integer id) {
        return id;
    }
}
