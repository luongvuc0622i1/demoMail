package com.authentication;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class controller {

    @Autowired
    private MailSender mailSender;
    @PostMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request){
        mailSender.sendEmail("luong.vu1012@gmail.com","birthday","10121997");
    }
}
