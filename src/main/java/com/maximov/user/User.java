package com.maximov.user;

public class User {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int yearOfBirth;
    private String emailAdress;

    public User() {
    }

    public User(String lastName, String firstName, String patronymic, int yearOfBirth, String emailAdress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.emailAdress = emailAdress;
    }


    @Override
    public String toString() {
        return "ФИО: '" + lastName +
                " " + firstName +
                " " + patronymic + '\'' + "\n" +
                "Год Рождения: '" + yearOfBirth + '\'' + "\n" +
                "e-mail = '" + emailAdress + '\'';
    }

    public int getAge() {
        return 2025 - yearOfBirth;
    }
}
