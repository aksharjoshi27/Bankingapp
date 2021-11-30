package com.xoriant.Loginservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ManagerLogin {
	@Entity
	@Table(name = "account_authentication")
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class CustomerLogin {
		@Id
		
		private int ID;
		private String password;
		
		
	}
}
