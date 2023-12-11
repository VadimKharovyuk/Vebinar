package com.example.demo.controler;

import com.example.demo.model.User;
import com.example.demo.repa.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    @Autowired
    private UserRepo userRepo ;
    @GetMapping("/signUp")
    public String getSignUp(){
        return "signUp_page.html" ;
    }
    @PostMapping("/signUp")
    public String signUp(User user){
        userRepo.save( user);
        return "redirect:/signUp" ;


    }
}
