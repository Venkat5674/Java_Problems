package com.practice.oops.encapsulation;


public class User {
    String username;               // default access
    private String password;       // private
    private int age;
    private long phoneNumber;

    public User(String username, String password, int age, long phoneNumber) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        // you can add password validation here
        this.password = password;
    }

    public void setPhoneNumber(long phoneNumber) {
        String s = phoneNumber + "";
        if (s.length() == 10 && phoneNumber > 0) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void display() {
        System.out.println(this.age + " " + this.username + " " + this.phoneNumber + " " + this.password);
    }
}
