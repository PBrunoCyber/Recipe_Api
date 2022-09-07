package com.example.recipe_api.recipe_package;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeService) {
        this.recipeRepository = recipeService;
    }

    public List<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }

    public List<String> recipeEmptyVerify(Recipe recipe) {
        List<String> errors = new ArrayList<>();
        if (recipe.getName().isEmpty())
            errors.add("The field name is required!");
        if (recipe.getImage().isEmpty())
            errors.add("The field image is required!");
        if (recipe.getDescription().isEmpty())
            errors.add("The field description is required!");
        if (recipe.getTotalTime().toString().equals("00:00:00"))
            errors.add("The field total time is required!");
        return errors;
    }

    public void addNewRecipe(Recipe recipe) {
        String error = String.join(", ", recipeEmptyVerify(recipe));
        if (!error.isEmpty())
            throw new IllegalStateException(error);
        recipeRepository.save(recipe);
    }

    public void removeRecipe(Long id) {
        boolean existById = recipeRepository.existsById(id);
        if (!existById)
            throw new IllegalStateException("Food Recipe was not found!");
        recipeRepository.deleteById(id);
    }

    @Transactional
    public void updateRecipe(Long id, String name, String description, Time totalTime) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Food Recipe was not found!"));
        if (name != null && name.length() > 0 && !Objects.equals(recipe.getName(), name))
            recipe.setName(name);
        if (description != null && description.length() > 0 && !Objects.equals(recipe.getDescription(), description))
            recipe.setDescription(description);
        if (totalTime != null && !totalTime.toString().equals("00:00:00") && !totalTime.toString().isEmpty()
                && !Objects.equals(recipe.getTotalTime(), totalTime))
            recipe.setTotalTime(totalTime);
        if (name.length() == 0 || description.length() == 0 || totalTime.toString().equals("00:00:00"))
            throw new IllegalStateException("Some field(s) is empty!");
    }

}
