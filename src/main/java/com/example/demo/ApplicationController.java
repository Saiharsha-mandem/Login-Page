package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("server")
    public ModelAndView verifyUser(@RequestParam("username") String username, @RequestParam("password") String password)
    {

        String default_username= "fresherpro";
        String default_password="fresherpro";

        ModelAndView mv= new ModelAndView();

        if(username.equals(default_username) && password.equals(default_password))
        {

            mv.setViewName("welcome");
            String message=username;
            mv.addObject("welcome",message);
        }
        else
        {
            mv.setViewName("index");

            String message="Sorry, Invalid Credentials";

            mv.addObject("index",message);
        }

        return mv;
    }


}
