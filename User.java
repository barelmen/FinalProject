package com.example.registration;

public class User {
    private String name;
    private String email;
    private String age;
    private String uid;

    public User(String name, String email, String age, String uid){
        this.name = name;
        this.email = email;
        this.age = age;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAge() {
        return age;
    }
    public String getUid() {
        return uid;
    }
}

