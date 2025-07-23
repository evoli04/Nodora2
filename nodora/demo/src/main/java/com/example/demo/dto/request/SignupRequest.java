package com.example.demo.dto.request;

public class SignupRequest {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String memberName;

    public SignupRequest() {
    }

    public SignupRequest(String name, String surname, String email, String password, String memberName) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}