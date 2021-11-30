package com.xoriant.Loginservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.Loginservice.api.entity.ManagerLogin;

import com.xoriant.Loginservice.api.repository.ManagerLoginRepository;

@Service
public class ManagerLoginService {
	@Autowired
	private ManagerLoginRepository mrepository;
	
	public ManagerLogin saveManagerLogin(ManagerLogin managerlogin) {
		return mrepository.save(managerlogin);
	}
}
