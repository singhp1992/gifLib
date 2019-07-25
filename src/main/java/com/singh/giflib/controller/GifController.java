package com.singh.giflib.controller;

import com.singh.giflib.data.GifRepository;
import com.singh.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, Model model) {
        Gif gif = gifRepository.findByName("android-explosion");
        model.addAttribute("gif", gif);
        return "gif-details";
    }
}
