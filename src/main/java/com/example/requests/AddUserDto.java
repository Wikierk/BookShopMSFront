package com.example.requests;

public class AddUserDto {
    public String name;
    public String email;
    public String password;

    // TODO: remove roleName
    public String roleName;

    public AddUserDto(String name, String email, String password, String roleName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.roleName = roleName;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}