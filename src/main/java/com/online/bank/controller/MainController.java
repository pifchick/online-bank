package com.online.bank.controller;

import com.online.bank.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Главная сраница");
        return "home";
    }
    @GetMapping("/sing-in")
    public String singin(Model model){
        model.addAttribute("title", "Войти");
        return "sing-in";
    }
    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("title", "Зарегестрироваться");
        return "registration";
    }
    @GetMapping("/kontact")
    public String kontact(Model model){
        model.addAttribute("title", "Контакты");
        return "kontact";
    }
    @GetMapping("/we")
    public String we(Model model){
        model.addAttribute("title", "Почему стоит выбрать нас");
        return "we";
    }
}
