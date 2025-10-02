package com.maximov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(rangeBetweenMaxAndMin(-9, 25));
    }

    public static List<Integer> rangeBetweenMaxAndMin(int min, int max){
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i ++){
            list.add(i);
        }
        return list;
    }
}