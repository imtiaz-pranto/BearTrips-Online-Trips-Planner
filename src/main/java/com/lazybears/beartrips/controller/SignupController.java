package com.lazybears.beartrips.controller;

import com.lazybears.beartrips.dao.UserRepo;
import com.lazybears.beartrips.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController{

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getStartPage() {
        return "signup";
    }


    @Autowired
    UserRepo repo;

    @RequestMapping("/")
    public String addsign(){
        return "/signup.html";
    }

    @RequestMapping("/adduser")
    public String adduser(User user){

        repo.save(user);
        return "/signup.html";
    }
    @RequestMapping("/getuser")
    public ModelAndView getuser(@RequestParam String user){


        ModelAndView mv=new ModelAndView("profile");
        User user1 = repo.findById(user).orElse(new User());
        mv.addObject(user);
        return mv;
    }


}


