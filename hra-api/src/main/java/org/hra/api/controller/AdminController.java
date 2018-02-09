package org.hra.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/verify")
	public String adminVerify(){
		return "Admin";
	}
}
