package com.maximov;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedThreads {
    private static boolean aTurn = true;
    private static boolean bTurn = false;
    private static boolean cTurn = false;

    private static final Object lock = new Object();

    static class PrintTask implements Runnable {
        private final char letter;
        private final int count;

        public PrintTask(char letter, int count) {
            this.letter = letter;
            this.count = count;
        }

        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                synchronized (lock) {
                    while (!isMyTurn()) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    System.out.print(letter);
                    nextTurn();
                    lock.notifyAll();
                }
            }
        }

        private boolean isMyTurn() {
            return switch (letter) {
                case 'A' -> aTurn;
                case 'B' -> bTurn;
                case 'C' -> cTurn;
                default -> false;
            };
        }

        private void nextTurn() {
            if (aTurn) {
                aTurn = false;
                bTurn = true;
            } else if (bTurn) {
                bTurn = false;
                cTurn = true;
            } else if (cTurn) {
                cTurn = false;
                aTurn = true;
            }
        }
    }
}
