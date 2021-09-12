package com.example.myapplication;

public class Product {
    String name;
    String numberphone;
    String email;
    boolean avatarUser;

    public Product(String name, String numberphone, String email, boolean avatarUser) {
        this.name = name;
        this.numberphone = numberphone;
        this.email = email;
        this.avatarUser = avatarUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAvatarUser() {
        return avatarUser;
    }

    public void setAvatarUser(boolean avatarUser) {
        this.avatarUser = avatarUser;
    }
}
