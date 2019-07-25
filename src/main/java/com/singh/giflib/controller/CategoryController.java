package com.singh.giflib.controller;

import com.singh.giflib.data.CategoryRepository;
import com.singh.giflib.data.GifRepository;
import com.singh.giflib.model.Category;
import com.singh.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(Model model) {
        List<Category> categories = categoryRepository.getAllCategories();
        model.addAttribute("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, Model model) {
        Category category = categoryRepository.findById(id);
        model.addAttribute("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        model.addAttribute("gifs", gifs);

        return "category";
    }
}
