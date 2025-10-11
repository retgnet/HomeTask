package com.maximov;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Алексей", Position.SENIOR_MANAGER, 100L);

        PersonDataBase personDataBase = new PersonDataBase();

        personDataBase.add(person);

        System.out.println(personDataBase.findById(100L));

        System.out.println(personDataBase.isManager(person));

        System.out.println(personDataBase.isEmployee(100L));

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(SortingClass.bubbleSort(array)));
        System.out.println(Arrays.toString(SortingClass.directSort(array)));
    }
}