package com.xoriant.Loginservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.Loginservice.api.entity.ManagerLogin;
import com.xoriant.Loginservice.api.service.ManagerLoginService;
@RestController
@RequestMapping("/Login")
public class ManagerLoginServiceController {
	@Autowired
	private ManagerLoginService mservice;
	
@PostMapping("/ManagerLogin")
	
	public ManagerLogin  managerLogin(@RequestBody ManagerLogin managerlogin) {
		return mservice.saveManagerLogin(managerlogin);
		
	}

}
