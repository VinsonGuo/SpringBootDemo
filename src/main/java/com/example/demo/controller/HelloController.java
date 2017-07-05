package com.example.demo.controller;

import com.example.demo.model.CommonResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/7/5.
 */
@RestController
public class HelloController {

    @ApiOperation(value = "入口测试", notes = "hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public CommonResponse<String> hello() throws Exception {
        CommonResponse<String> response = new CommonResponse<>();
        response.setMessage("hello123");
        response.setData("spring boot demo");
        return response;
    }
}
