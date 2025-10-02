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
        System.out.println(returnNameOfEmployers(employers));

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
    public static ArrayList<String> returnNameOfEmployers(ArrayList<Employer> employers){
        ArrayList<String> names = new ArrayList<>();
        for(Employer employer : employers){
            names.add(employer.getName());
        }
        return  names;
    }
}