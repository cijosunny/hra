package org.hra.api.controller;

import org.hra.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private ApiService apiService;
	@RequestMapping("/version")
	public String getApiVersion(){
		return apiService.getApiVersion();
	}
}
