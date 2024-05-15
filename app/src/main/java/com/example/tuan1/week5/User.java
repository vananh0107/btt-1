package com.example.tuan1.week5;

public class User {
    private final String idUser;
    private final String email;
    private final String fullName;
    private final String birthDay;
    private final String password;
    private final String image;
    private final String role;

    public User(String idUser, String email, String fullName, String birthDay, String password, String role,String image) {
        this.idUser = idUser;
        this.email = email;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.password = password;
        this.role = role;
        this.image=image;
    }

    public String getIdUser() {
        return idUser;
    }
    public String getImage() {
        return image;
    }
    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
