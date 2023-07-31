package com.kusanov.bootcampjava.entity;

import jakarta.persistence.*;
import org.intellij.lang.annotations.Pattern;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private int id;
    @Pattern("\\w{2,40}")
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    @Pattern("\\w{2,20}")
    private String name;
    @Column(name = "middle_name")
    @Pattern("\\w{2,40}")
    private String midname;
    @Column(name = "email")
    @Pattern("(\\w+@(\\w+)\\.(com|ru)){2,50}")
    private String email;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role Role;

    public Role getRole() {
        return Role;
    }

    public void setRole(Role role) {
        Role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}