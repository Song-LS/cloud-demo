package com.sls.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sls
 **/
@RestController
public class HelloController {

    @GetMapping("/test/hello")
    public ResponseEntity test() {
        return ResponseEntity.ok("heelo zuul");
    }
}
