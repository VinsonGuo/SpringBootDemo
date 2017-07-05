package com.example.demo.controller;

import com.example.demo.model.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/7/5.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public CommonResponse<String> hello() {
        CommonResponse<String> response = new CommonResponse<>();
        response.setMessage("hello");
        response.setData("spring boot demo");
        return response;
    }
}
