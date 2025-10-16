package com.maximov;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int PORT = 8888;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен с портом: " + PORT);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Новое подключение ");
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                String[] parts = inputLine.split(" ");
                if (parts.length != 3) {
                    out.println("Неверный формат ");
                    continue;
                }
                double num1 = Double.parseDouble(parts[0]);
                double num2 = Double.parseDouble(parts[2]);
                String operator = parts[1];
                double result = calculate(num1, num2, operator);
                out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Деление на ноль! ");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Неверная операция! ");
        }
    }
}
