package com.codechef.newBackEnd.login;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
public class userLoginController {

    private final userLoginService userloginService;

    @Autowired
    public userLoginController(userLoginService userloginService) {
        this.userloginService = userloginService;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new userLogin());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") userLogin user, Model model) {
        try {
            userLogin oauthUser = userloginService.login(user.getUSERNAME(), user.getPASSWORD());
            if (Objects.nonNull(oauthUser)) {
                return "redirect:/recipes";
            } else {
                model.addAttribute("error", "Invalid username or password.");
                return "login";
            }
        } catch (CustomLoginException e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }


    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response)
    {
        return "redirect:/login";
    }








    /*To List and view table content:
    @RequestMapping(path= "api/v1/userLogin")
    @GetMapping
    public Optional<userLogin> getuser(){
        return userloginService.getuser();
    }
    @RequestMapping(path= "login")
    @GetMapping("/login")
    public String login(){
        return "login";
    }*/
}