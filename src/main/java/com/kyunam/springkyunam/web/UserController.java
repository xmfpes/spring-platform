package com.kyunam.springkyunam.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "/user/page-login";
	}
	@GetMapping("/registerForm")
	public String registerForm(){
		return "/user/page-register";
	}
}
