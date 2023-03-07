// Write your code here
package com.example.recipe;
import com.example.recipe.Recipe;
import java.util.*;

public interface RecipeRepository{
    ArrayList<Recipe> getRecipes();
    Recipe getRecipe(int recipeId);
    Recipe addRecipe(Recipe recipe);
    Recipe updateRecipe(int recipeId,Recipe recipe);
    void deleteRecipe(int recipeId);
} 
