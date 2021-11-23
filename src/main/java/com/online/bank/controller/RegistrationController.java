package com.online.bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("title", "Зарегестрироваться");
        if(model != null){
            return "/registration";
        }else {
            return "/home";
        }

    }
}
