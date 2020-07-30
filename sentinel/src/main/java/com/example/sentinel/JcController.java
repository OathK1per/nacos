package com.example.sentinel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuanping Zhang
 * @date
 */
@RestController
public class JcController {

    @GetMapping("/hello")
    public String hello() {
        return "Oh! Jesus";
    }
}
