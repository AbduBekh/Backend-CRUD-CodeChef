package com.codechef.newBackEnd.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class recipeService {

    private final recipeRepository recipeRepository;

    @Autowired
    public recipeService(recipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> listAll() {
        return recipeRepository.findAll();
    }

    public void save(Recipe r) {
        recipeRepository.save(r);
    }

    public Recipe get(long id) {
        return recipeRepository.findById(id).get();
    }

    public void delete(long id) {
        recipeRepository.deleteById(id);
    }
}