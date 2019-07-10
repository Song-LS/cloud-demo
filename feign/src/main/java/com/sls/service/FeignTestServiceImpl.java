package com.sls.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sls
 **/
@Component
public class FeignTestServiceImpl implements FeignTestService {

    @Override
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("code","回退了");
        return map;
    }

    @Override
    public String test2(String parame1) {
        return null;
    }

    @Override
    public Integer test3(Integer id) {
        return null;
    }
}
