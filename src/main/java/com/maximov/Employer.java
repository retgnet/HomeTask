package com.maximov;

public class Employer {
    private String name;
    private int age;

    public Employer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
