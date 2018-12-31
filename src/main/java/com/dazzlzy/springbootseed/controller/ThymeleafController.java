package com.dazzlzy.springbootseed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/index")
public class ThymeleafController {


    @RequestMapping("/model")
    public String page3(Model model){
        model.addAttribute("user","seawater");
        return "index";
    }

}
