package com.maximov;

import java.util.Arrays;

public class SortingClass {

    public static int[] bubbleSort(int[] array) {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }

        } while (flag);
        return array;
    }
    public static int[] directSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minPosition]) minPosition = j;
            }
            if(minPosition != i) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }


        return array;
    }


}
