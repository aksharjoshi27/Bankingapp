package com.xoriant.Loginservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.Loginservice.api.entity.CustomerLogin;
import com.xoriant.Loginservice.api.repository.CustomerLoginRepository;
@Service
public class CustomerLoginService {
	@Autowired
	private CustomerLoginRepository repository;
	
	public CustomerLogin saveCustomerLogin(CustomerLogin customerlogin) {
		return repository.save(customerlogin);
	}

}
