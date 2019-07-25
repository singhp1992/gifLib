package com.singh.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnotherController {
    @RequestMapping("/gif")
    @ResponseBody
    public String anotherOne() {
        return "Hoping for the best!";
    }
}
