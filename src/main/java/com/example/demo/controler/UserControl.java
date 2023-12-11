package com.example.demo.controler;

import com.example.demo.model.User;
import com.example.demo.repa.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserControl {
    @Autowired
   private   UserRepo userRepozitoriy ;
    @GetMapping("/users")
    public String getUserPage(Model model){
        List<User> users = userRepozitoriy.findAll();
        model.addAttribute("users",users);
        return "User" ;
    }

}
