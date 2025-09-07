package com.example.boot303_thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller001 {

    @RequestMapping("/well")
    public String index(@RequestParam("name") String name, Model model){
        model.addAttribute("msg",name);
        return "welcome";
    }
}
