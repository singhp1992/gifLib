package com.singh.giflib.controller;

import com.singh.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {

    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(Model model) {
        Gif gif = new Gif("android-explosion", LocalDate.of(2015,2,13), "Preeti Singh", true);
        model.addAttribute("gif", gif);
        return "gif-details";
    }
}
