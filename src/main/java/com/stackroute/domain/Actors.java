package com.stackroute.domain;

public class Actors {
    private String name;
    private String gender;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name :"+name+" Gender : "+gender+" Age : "+age);
    }
}
