package com.spring.education.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

public class Master extends Person {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Course course;

}
