package com.example.demo.security;

import com.example.demo.errors.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String getRegisterPage(@ModelAttribute RegistrationModel registrationModel){
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute RegistrationModel registrationModel, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "register";
        }

        this.userService.register(registrationModel);

        return "redirect:/";
    }
    @PostMapping("/login")
    public String registerUser(){
       
        return "index";
    }
    @GetMapping("/login")
    public String getLoginPage(@RequestParam(required = false) String error, Model model){
        if(error != null){
            model.addAttribute("error", Errors.INVALID_CREDENTIALS);
        }

        return "login";
    }

    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<UserViewModel> userViewModelList = this.userService.findAll();
        model.addAttribute("users", userViewModelList);
        return "users";
    }
    @GetMapping("/logout")
    public String logout(){
       

        return "index";
    }
}
