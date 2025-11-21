package com.maximov;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new SynchronizedThreads.PrintTask('A', 5));
        executorService.submit(new SynchronizedThreads.PrintTask('B', 5));
        executorService.submit(new SynchronizedThreads.PrintTask('C', 5));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println(" End..");
    }
}