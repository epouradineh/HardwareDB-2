package com.adineh.hw.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHomePage(Model model) {
		String loginUser = SecurityContextHolder.getContext().getAuthentication().getName().toString();
		model.addAttribute("loginUser",loginUser);
		return "home";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
