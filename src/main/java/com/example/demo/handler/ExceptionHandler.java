package com.example.demo.handler;

import com.example.demo.model.CommonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一的异常管理
 * Created by dell on 2017/7/5.
 */
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    @ResponseBody
    public CommonResponse<String> errorHandler(HttpServletRequest req, Exception e) {
        CommonResponse<String> response = new CommonResponse<>();
        response.setCode(-1);
        response.setMessage(e.getMessage());
        response.setData(req.getRequestURL().toString());
        return response;
    }
}
