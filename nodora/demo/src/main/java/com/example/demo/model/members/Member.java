package com.example.demo.model.members;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "surname", length = 30)
    private String surname;

    @Column(name = "email", length = 30, unique = true)
    private String email;

    @Column(name = "password", length = 15)
    private String password;

    @Column(name = "is_admin") // Tabloda is_admin olarak tanımlı
    private Boolean isAdmin;

    @Column(name = "membername", length = 20) // Tabloda membername olarak tanımlı
    private String memberName;

    // No-args constructor
    public Member() {
    }

    // All-args constructor
    public Member(Integer memberId, String name, String surname, String email,
                  String password, Boolean isAdmin, String memberName) {
        this.memberId = memberId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.memberName = memberName;
    }

    // Getters and Setters
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

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

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}