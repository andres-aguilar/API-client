package com.yosh.checkeat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.yosh.checkeat.models.MainRequest;



@Controller
public class WSClient {
	
	@GetMapping("/list")
	public String view(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		MainRequest req = restTemplate.getForObject("https://sandbox-checkeat.appspot.com/api/v2/subsidiary?", MainRequest.class);
		
		model.addAttribute("title", "Listado");
		model.addAttribute("request", req);
		
		return "list";
	}
}
