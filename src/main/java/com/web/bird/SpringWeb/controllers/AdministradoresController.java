package com.web.bird.SpringWeb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.bird.SpringWeb.models.Administrador;
import com.web.bird.SpringWeb.repositorio.AdministradoresRepo;

@Controller
public class AdministradoresController 
{
	@Autowired
	private AdministradoresRepo repo;
	@GetMapping("/administradores")
	public String index(Model model)
	{
		List<Administrador> administradores = (List<Administrador>)repo.findAll();
		model.addAttribute("administradores", administradores);
		
		return "administradores/index";
	}
	
	@GetMapping("/administradores/novo")
	public String novo()
	{
		return "administradores/novo";
	}
	
	@PostMapping("/administradores/criar")
	public String criar(Administrador administrador)
	{
		repo.save(administrador);
		return "bazar/bazar";
	}
	
	   @GetMapping("/administradores/{id}")
	    public String busca(@PathVariable int id, Model model)
	    {
	        Optional<Administrador> admin = repo.findById(id);
	        model.addAttribute("administrador", admin);
	        return "redirect:/administradores/editar";
	    }
	
	@GetMapping("administradores/{id}/excluir")
    public String excluir(@PathVariable int id)
    {
        repo.deleteById(id);
        return "redirect:/administradores";
    }
}

