package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfBirth;

    @Column(name = "joining_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date joiningDate;

    @Column(name = "class_name")
    private String className;

}
