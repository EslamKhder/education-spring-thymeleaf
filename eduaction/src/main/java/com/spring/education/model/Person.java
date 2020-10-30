package com.spring.education.model;

import com.spring.education.model.enums.Gender;

import javax.persistence.Column;
import java.util.Date;

public class Person extends Boy {

    @Column(name = "age")
    private String age;

    @Column(name = "address")
    private String address;

    @Column(name = "date")
    private Date date;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last-updated")
    private Date lastUpdated;
}