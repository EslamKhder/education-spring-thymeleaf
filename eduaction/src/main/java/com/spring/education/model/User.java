package com.spring.education.model;

import javax.persistence.*;
import java.util.List;

public class User extends BaseEntity{

    private String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private List<Role> roles;

    private Student student;

    private Master master;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    private Admin admin;

}
