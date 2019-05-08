package com.lazybears.beartrips.controller.Pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlacesController {


    @RequestMapping(value = "/places", method = RequestMethod.GET)
    public String getStartPage(){
        return "places";
    }
}
