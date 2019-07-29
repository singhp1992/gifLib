package com.singh.giflib.model;

public class Person {
    private String name;
    private int studentId;
    private String username;

    public Person(String name, int studentId,  String username) {
        this.name = name;
        this.studentId = studentId;
        this.username = username;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

