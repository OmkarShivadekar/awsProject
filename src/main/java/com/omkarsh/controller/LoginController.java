package com.omkarsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	
	@GetMapping("/loginPage")
	public String shoMyLoginPage()
	{
		return "login-page";
	}
	
	
	//access denied
	@GetMapping("/access-denied")
	public String access()
	{
		return "access-denied";
	}
}
