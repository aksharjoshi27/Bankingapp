package com.xoriant.Loginservice.api.repository;

import com.xoriant.Loginservice.api.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * @Author rohit
 * @Date 30/11/21
 **/

@Repository
public interface UserRepository extends JpaRepository<Users, UUID> {
    Optional<Users> findByUsernameAndPassword(String username, String password);
    Optional<Users> findByUsername(String username);
}
