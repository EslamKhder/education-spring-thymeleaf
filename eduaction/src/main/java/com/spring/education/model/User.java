package com.spring.education.model;

import java.util.List;

public class User extends BaseEntity{

    private String username;

    private String password;

    private List<Role> roles;

    private Student student;

    private Master master;

    private Admin admin;

}
