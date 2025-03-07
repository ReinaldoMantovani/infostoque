package com.example.application.dto;

import com.example.application.backend.domain.enums.Roles;

public class UserDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Roles role;

    public UserDto() {
    }

    public UserDto(Roles role, String password, String email, String lastName, String name, Long id) {
        this.role = role;
        this.password = password;
        this.email = email;
        this.lastName = lastName;
        this.name = name;
        this.id = id;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
