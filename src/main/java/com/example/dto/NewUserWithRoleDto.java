package com.example.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewUserWithRoleDto {
    public String name;
    public String email;
    public String password;
    public Role role;

    @JsonCreator
    public NewUserWithRoleDto(@JsonProperty("name") String name,
                              @JsonProperty("email") String email,
                              @JsonProperty("password") String password,
                              @JsonProperty("role") Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
