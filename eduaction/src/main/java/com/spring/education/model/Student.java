package com.spring.education.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student extends Person {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "students")
    List<Course> courses;
}