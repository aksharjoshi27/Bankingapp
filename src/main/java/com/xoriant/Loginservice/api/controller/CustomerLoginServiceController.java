package com.xoriant.Loginservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.Loginservice.api.entity.CustomerLogin;

import com.xoriant.Loginservice.api.service.CustomerLoginService;


@RestController
@RequestMapping("/Login")
public class CustomerLoginServiceController {
	@Autowired
	private CustomerLoginService service;
	
	
	@PostMapping("/customerLogin")
	public CustomerLogin  customerLogin(@RequestBody CustomerLogin customerlogin) {
		return service.saveCustomerLogin(customerlogin);
		
	}
	


}
