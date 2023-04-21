package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class controller {

    @Autowired
    private MailSender mailSender;
    @GetMapping("/verifyCode")
    public String verifyCode(){
        return "Verify";
    }
    @PostMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request){
        mailSender.sendEmail("luong.vu1012@gmail.com","birthday","10121997");
    }
}
