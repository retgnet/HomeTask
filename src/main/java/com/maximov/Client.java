package com.maximov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static final String HOST = "localhost";
    public static final int PORT = 8888;

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PORT);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Доступные операции: +, -, *, /");
            while (true) {
                System.out.print("Введите доступную операцию (Например 2 + 2 ) ");
                String input = consoleIn.readLine();
                out.println(input);
                String result = in.readLine();
                System.out.println("Результат : " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
