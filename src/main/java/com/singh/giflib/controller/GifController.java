package com.singh.giflib.controller;

import com.singh.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Autowired;


@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(Model model) {
        Gif gif = gifRepository.findByName("android-explosion");
        model.addAttribute("gif", gif);
        return "gif-details";
    }
}
