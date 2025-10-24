package com.maximov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        double[] array = fillArraySingleThread();

        long endTime = System.currentTimeMillis();
        System.out.println("Однопоточная реализация: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        array = fillArrayMultiThread();
        endTime = System.currentTimeMillis();
        System.out.println("Многопоточная реализация: " + (endTime - startTime) + " мс");

    }

    private static double[] fillArraySingleThread() {
        int size = 100_000_000;
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return array;
    }

    private static double[] fillArrayMultiThread(){
        int size = 100_000_000;
        double[] array = new double[size];
        int partSize = size / 4;
        Thread[] threads = new Thread[4];

        for (int t = 0; t < 4; t++) {
            final int threadIndex = t;
            threads[t] = new Thread(() -> {
                int start = threadIndex * partSize;
                int end = (threadIndex == 3) ? size : start + partSize;
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threads[t].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return array;
    }


}