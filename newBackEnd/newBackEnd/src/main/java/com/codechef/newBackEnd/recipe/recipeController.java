package com.codechef.newBackEnd.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class recipeController {

    private final recipeService recipeService;

    @Autowired
    public recipeController(recipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping("/recipes")
    public String viewHomePage(Model model) {
        List<Recipe> listrecipe = recipeService.listAll();
        model.addAttribute("listrecipe", listrecipe);
        System.out.print("Get / ");
        return "recipes";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("Recipe", new Recipe());
        return "new";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRecipe(@ModelAttribute("Recipe") Recipe r) {

        recipeService.save(r);
        return "redirect:/recipes";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditRecipePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Recipe r = recipeService.get(id);
        mav.addObject("Recipe", r);
        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deleteRecipe(@PathVariable(name = "id") int id) {
        recipeService.delete(id);
        return "redirect:/recipes";
    }
}