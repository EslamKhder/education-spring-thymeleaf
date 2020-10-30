package com.spring.education.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.List;

public class Student extends Person {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    List<Course> courses;
}
