package com.goffa.springboot.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "fancy-login";
    }
    @GetMapping("/access-denied")
    public String showDeniedAccess(){
        return "access-denied";
    }
}
