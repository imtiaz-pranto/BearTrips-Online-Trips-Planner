package com.lazybears.beartrips.controller.Pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


  @Controller
    public class Booking{

        @RequestMapping(value = "/book", method = RequestMethod.GET)
        public String getStartPage(){
            return "book";
        }
    }

