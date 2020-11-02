package com.spring.education.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "course")
public class Course extends BaseEntity {

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_price")
    private String coursePrice;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_course",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    List<Student> students;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    List<Master> masters;

}