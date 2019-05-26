package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/converter")
public class ConvertServlet {
    @GetMapping
    public String showConvert() {
        return "converter";
    }

    @PostMapping
    public ModelAndView convert(@RequestParam("rate") double rate, @RequestParam("usd") double usd) {
        double vnd = rate * usd;
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}
