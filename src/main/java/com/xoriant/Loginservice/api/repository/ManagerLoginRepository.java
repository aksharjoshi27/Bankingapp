package com.xoriant.Loginservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xoriant.Loginservice.api.entity.ManagerLogin;
@Repository
public interface ManagerLoginRepository extends JpaRepository<ManagerLogin,Integer>{

}
