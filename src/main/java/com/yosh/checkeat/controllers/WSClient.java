package com.yosh.checkeat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.yosh.checkeat.models.MainRequest;
import com.yosh.checkeat.models.SubsidiaryGeneral;



@Controller
public class WSClient {
	
	@GetMapping("/")
	public String view(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		MainRequest req = restTemplate.getForObject("https://sandbox-checkeat.appspot.com/api/v2/subsidiary?", MainRequest.class);
		
		model.addAttribute("title", "Listado");
		model.addAttribute("request", req);
		
		return "list";
	}
	
	@GetMapping("/subsidiary/{id}")
	public String viewSubsidiary(@PathVariable("id") String id, Model model) {
		if (id != null && !id.isEmpty()) {
			RestTemplate restTemplate = new RestTemplate();
			SubsidiaryGeneral req = restTemplate.getForObject("https://sandbox-checkeat.appspot.com/api/v2/subsidiary/"+id, SubsidiaryGeneral.class);
			
			model.addAttribute("title", req.getName());
			model.addAttribute("request", req);
			
			return "subsidiary_general";
		}
		
		
		return "";
	}
}
