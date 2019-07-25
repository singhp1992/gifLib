package com.singh.giflib.data;

import com.singh.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> All_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, "Destruction")
            );

    public List<Category> getAllCategories() {
        return All_CATEGORIES;
    }

    public  Category findById(int id) {
        for(Category category : All_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
