package com.spring.education.model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "admin")
public class Admin extends Boy {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
