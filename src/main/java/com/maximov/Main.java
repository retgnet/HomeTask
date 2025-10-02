package com.maximov;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(rangeBetweenMaxAndMin(-9, 2));

        System.out.println(sumOfList(CreateAndFillList(0, 10)));

        System.out.println(setValueInList(CreateAndFillList(-3, 3), 5));

        System.out.println(increaseElementOfListToValue(CreateAndFillList(1, 3), 2));

        ArrayList<Employer> employers = new ArrayList<>();

        employers.add(new Employer("Максим", 30));

        employers.add(new Employer("Игорь", 22));

        employers.add(new Employer("Никита", 18));

        employers.add(new Employer("Андрей", 44));

        System.out.println(returnNameOfEmployers(employers));

        System.out.println(returnNameOfEmployers(employers, 19));

        checkAverageAgeOfEmployers(employers, 22);

        System.out.println(youngestEmployee(employers));

    }

    public static ArrayList<Integer> CreateAndFillList(int minNumberOfRange, int maxNumberOfRange) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = minNumberOfRange; i <= maxNumberOfRange; i++) {
            list.add(i);
        }
        return list;
    }

    public static ArrayList<Integer> rangeBetweenMaxAndMin(int min, int max) {
        return CreateAndFillList(min, max);
    }

    public static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    public static ArrayList<Integer> setValueInList(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
        return list;
    }

    public static List<Integer> increaseElementOfListToValue(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + value);
        }
        return list;
    }

    public static ArrayList<String> returnNameOfEmployers(ArrayList<Employer> employers) {
        ArrayList<String> names = new ArrayList<>();
        for (Employer employer : employers) {
            names.add(employer.getName());
        }
        return names;
    }

    public static ArrayList<String> returnNameOfEmployers(ArrayList<Employer> employers, int minAge) {
        ArrayList<String> names = new ArrayList<>();
        for (Employer employer : employers) {
            if (employer.getAge() >= minAge) {
                names.add(employer.getName());
            }
        }
        return names;
    }

    public static void checkAverageAgeOfEmployers(ArrayList<Employer> employers, int averageAge) {
        int averageAgeOfEmployers = 0;
        for (Employer employer : employers) {
            averageAgeOfEmployers += employer.getAge();
        }
        if (averageAgeOfEmployers / employers.size() > averageAge) {
            System.out.println("Средний возраст сотрудников выше нормы!");
        } else {
            System.out.println("Средний возраст сотрудников в норме");
        }
    }

    public static String youngestEmployee(ArrayList<Employer> employers) {
        String youngEmployee = " ";
        int minAge = Integer.MAX_VALUE;
        for (Employer employer : employers) {
            if (employer.getAge() < minAge) {
                minAge = employer.getAge();
                youngEmployee = employer.getName();
            }
        }
        return youngEmployee;
    }
}