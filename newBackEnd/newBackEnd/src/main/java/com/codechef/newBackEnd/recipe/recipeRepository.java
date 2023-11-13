package com.codechef.newBackEnd.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface recipeRepository extends JpaRepository<Recipe, Long> {
}