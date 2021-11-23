package com.online.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/sing-in")
    public String singin(Model model){
        model.addAttribute("title", "Войти");
        return "sing-in";
    }
}
