package com.web.bird.SpringWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.bird.SpringWeb.models.Administrador;
import com.web.bird.SpringWeb.repositorio.AdministradoresRepo;

@Controller
public class LoginController 
{
    @Autowired
    private AdministradoresRepo repo;
    
    @GetMapping("/login")
    public String index()
    {
        return "login/index";
    }
    
    @PostMapping("/logar")
    public String logar(Model model, Administrador admParam)
    {
        Administrador adm = this.repo.Login(admParam.getEmail(),admParam.getSenha());
        if(adm != null)
        {
            return "bazar/index";
        }
        model.addAttribute("erro", "Usuario ou senha invalidos");
        return "login/index";
    }
}
