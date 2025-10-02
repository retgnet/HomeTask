package com.maximov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(rangeBetweenMaxAndMin(-9, 2));

        List<Integer> list = new ArrayList<>();
        System.out.println(sumOfList(fillListForMethod(list, 0, 10)));
    }

    public static List<Integer> rangeBetweenMaxAndMin(int min, int max) {
        List<Integer> list = new ArrayList<>();
        return fillListForMethod(list, min, max);
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

    public static List<Integer> fillListForMethod(List<Integer> list, int minNumberOfRange, int maxNumberOfRange) {
        for (int i = minNumberOfRange; i <= maxNumberOfRange; i++) {
            list.add(i);
        }
        return list;
    }
}