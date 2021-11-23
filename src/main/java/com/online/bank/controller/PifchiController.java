package com.online.bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PifchiController {

    @GetMapping("/pifchiblack")
    public String pifchiblack(Model model){
        model.addAttribute("title", "Часто задаваемые вопросы");
        return "pifchiblack";
    }
    @GetMapping("/simka")
    public String simka(Model model){
        model.addAttribute("title", "СИМ-карта от Pifchi");
        return "simka";
    }
    @GetMapping("/vklad")
    public String vklad(Model model){
        model.addAttribute("title", "Вклад от Pifhci");
        return "vklad";
    }
}
