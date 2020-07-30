package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuanping Zhang
 * @date
 */
@RestController
//@RequestMapping("/config")
@RefreshScope
public class IcController {

    @Value("${demo.title:}")
    private String title;

    @Value("${demo.body:}")
    private String body;

    @GetMapping("/config/test")
    public String hello() {
        return title;
    }

    @GetMapping("/body")
    public String body() {
        return body;
    }
}
