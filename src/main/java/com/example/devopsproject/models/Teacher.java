package com.example.devopsproject.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<Student> students;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public Teacher(String name) {
        this.name = name;
    }
    public Teacher(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Teacher() {}
}
