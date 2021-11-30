package com.xoriant.Loginservice.api.repository;
import com.xoriant.Loginservice.api.entity.CustomerLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerLoginRepository extends JpaRepository<CustomerLogin,Integer> {
	
}
