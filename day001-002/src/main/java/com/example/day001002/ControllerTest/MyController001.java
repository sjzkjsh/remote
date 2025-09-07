package com.example.day001002.ControllerTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController001 {
    @RequestMapping("/test")
    public String test(@RequestParam("name") String name, Model model) {
        model.addAttribute("msg", name);
        return "welcome";
    }
}
