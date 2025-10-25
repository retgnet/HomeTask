package com.maximov;

public class Main {
    private static final int SIZE = 100_000_000;
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
        double[] array = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = resolveMethodMath(i);
        }
        return array;
    }

    private static double[] fillArrayMultiThread(){
        double[] array = new double[SIZE];
        int partSize = SIZE / 4;
        Thread[] threads = new Thread[4];

        for (int t = 0; t < 4; t++) {
            final int threadIndex = t;
            threads[t] = new Thread(() -> {
                int start = threadIndex * partSize;
                int end = (threadIndex == 3) ? SIZE : start + partSize;
                for (int i = start; i < end; i++) {
                    array[i] = resolveMethodMath(i);
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
    public static double resolveMethodMath(int num){
        return 1.14 * Math.cos(num) * Math.sin(num * 0.2) * Math.cos(num / 1.2);
    }


}