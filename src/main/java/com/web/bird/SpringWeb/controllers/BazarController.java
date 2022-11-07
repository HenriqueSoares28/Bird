package com.web.bird.SpringWeb.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BazarController {
    @RequestMapping("/bazar")
    public String index()
    {
        return "bazar/index";
    }
    
}
