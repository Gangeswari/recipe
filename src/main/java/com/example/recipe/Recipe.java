// Write your code here
package com.example.recipe;
import java.util.*;

public class Recipe{
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public Recipe(int recipeId,String recipeName,String recipeType,List<String> ingredients){
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }
    public int getrecipeId(){
        return recipeId;
    }
    public void setrecipeId(int recipeId){
        this.recipeId = recipeId;
    }
    public String getrecipeName(){
        return recipeName;
    }
    public void setrecipeName(String recipeName){
        this.recipeName = recipeName;
    }
    public String getrecipeType(){
        return recipeType;
    }
    public void setrecipeType(String recipeType){
        this.recipeType = recipeType;
    }
    public List<String> getIngredients(){
        return ingredients;
    }
    public void setIngredients(List<String> ingredients){
        this.ingredients = ingredients;
    }
}