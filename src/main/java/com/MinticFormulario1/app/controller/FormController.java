package com.MinticFormulario1.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MinticFormulario1.app.entity.Usuario;

@Controller
public class FormController {
	
	@RequestMapping(value = {"/form"}, method = RequestMethod.GET) 
	public String form(Model model) {
		model.addAttribute("titulo","Formulario Alumno");
		return "form";
		
	}

	@RequestMapping(value = {"/form"}, method = RequestMethod.POST)
	public String procesar(Usuario usuario,Model model)
	{
		model.addAttribute("titulo","Resultado del formulario Alumno");
		model.addAttribute("usuario",usuario);
		return "resultado";
	}
}