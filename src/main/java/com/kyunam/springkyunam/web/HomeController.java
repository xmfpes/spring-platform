package com.kyunam.springkyunam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("")
	public String home(Model model) {
		return "index";
	}
	@GetMapping("/home")
	public String home2(Model model) {
		return "home";
	}
}
