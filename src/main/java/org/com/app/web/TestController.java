package org.com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "Test";
    }

    @PostMapping("pp")
    public void login(){
        String a = "되냐 ";
        System.out.println(a);
    }
}







