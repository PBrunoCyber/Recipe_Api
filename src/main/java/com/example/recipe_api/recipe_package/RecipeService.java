package com.example.recipe_api.recipe_package;

import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeService) {
        this.recipeRepository = recipeService;
    }

}
