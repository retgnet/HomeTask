package com.maximov;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("79276666743", "Николай");
        phoneBook.add("79278451762", "Алена");
        phoneBook.add("79516751231", "Артем");
        phoneBook.add("79520009865", "Николай");
        System.out.println(phoneBook.find("Николай"));
        System.out.println(phoneBook.find("Николай"));
        System.out.println(phoneBook.find("Артем"));

        System.out.println(phoneBook.containsPhoneNumber("79276666743"));
        System.out.println(phoneBook.containsPhoneNumber("79276666741"));

        System.out.println(phoneBook.getMapNames());
    }
}