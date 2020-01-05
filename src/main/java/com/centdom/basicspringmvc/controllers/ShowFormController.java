package com.centdom.basicspringmvc.controllers;

import com.centdom.basicspringmvc.models.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/show-form")
public class ShowFormController {
    private User user;

    @Autowired
    public ShowFormController(User user){
        this.user = user;
    }

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("user", this.user);
        return "form";
    }

    @PostMapping("/process-form")
    public String processForm(Model model, User userDetails) {
        model.addAttribute("name", userDetails.getName());
        model.addAttribute("email",  userDetails.getEmail());
        model.addAttribute("postcode" , userDetails.getPostcode());
        model.addAttribute("address",  userDetails.getAddress());
        return "confirmation-page";
    }


}
