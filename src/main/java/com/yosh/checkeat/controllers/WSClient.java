package com.yosh.checkeat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WSClient {
	
	@GetMapping("/list")
	public String view(Model model) {
		model.addAttribute("title", "Listado");
		
		return "list";
	}
}
