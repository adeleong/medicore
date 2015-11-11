package com.adeleon.medicore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "/{msg}", method = RequestMethod.GET)
    public String getIndex(Model model) {
        model.addAttribute("msg", "Bienvenido");
        return "index";
    }
} 