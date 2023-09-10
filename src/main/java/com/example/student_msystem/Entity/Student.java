package com.example.student_msystem.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private int age;
    private int maths;
    private int science;
    private float mean;
    private int english;


    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
        this.mean = (float) (maths*0.2+science*0.2+english*0.2)/3;

    }

    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
        this.mean = (float) (maths*0.2+science*0.2+english*0.2)/3;


    }

    public int getScience() {
        return science;

    }

    public void setScience(int science) {
        this.science = science;
        this.mean = (float) (maths*0.2+science*0.2+english*0.2)/3;

    }

    public float getMean() {
        return mean;
    }

    public void setMean(float mean) {
        this.mean = mean;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String email, int age,int maths, int science,int english) {
        super();
        this.name = name;
        this.email = email;
        this.age = age;
        this.maths = maths;
        this.science = science;
        this.english = english;


    }
}
