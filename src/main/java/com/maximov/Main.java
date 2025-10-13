package com.maximov;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Текущие файлы: ");
        System.out.println(checkCurrentFiles());
        System.out.println("Введите имя файла, который хотите просмотреть: ");
        String nameFile = scanner.nextLine();
        if (checkCurrentFiles().contains(nameFile)) {
            fileRead(nameFile);
            System.out.println("Введите информацию, которую хотите записать в файл: ");

            String data = scanner.nextLine();
            writeFile(nameFile, data);
            fileRead(nameFile);
        } else {
            System.out.println("Неверно ввели имя файла!");
        }
    }

    public static List<String> checkCurrentFiles() {
        File directory = new File(".");
        FilenameFilter txt = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };
        File[] txtFiles = directory.listFiles(txt);
        List<String> listFiles = new ArrayList<>();
        if (txtFiles != null) {
            for (File file : txtFiles) {
                listFiles.add(file.getName());
            }
        } else {
            System.out.println("Ошибка! Файлов с расширением txt не существует в данной директории! ");
        }
        return listFiles;
    }

    public static void fileRead(String nameFile) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(nameFile))) {

            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    public static void writeFile(String nameFile, String data) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(nameFile))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (byte b : buffer) {
                out.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}