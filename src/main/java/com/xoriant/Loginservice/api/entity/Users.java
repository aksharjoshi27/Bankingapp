package com.xoriant.Loginservice.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Map;
import java.util.UUID;

/**
 * @Author rohit
 * @Date 30/11/21
 **/
@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;

    private String username;
    private String password;

    private String firstName;
    private String lastName;

    @Transient
    Map<String,String> map;

}
