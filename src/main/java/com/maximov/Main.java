package com.maximov;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Текущие файлы: ");

        System.out.println("Введите имя файла, который хотите просмотреть: ");
        checkCurrentFiles();
        String nameFile = scanner.nextLine();

        fileRead(nameFile);
        System.out.println("Введите информацию, которую хотите записать в файл: ");

        String data = scanner.nextLine();
        writeFile(nameFile, data);
        fileRead(nameFile);


    }

    public static void checkCurrentFiles() {
        File directory = new File(".");
        FilenameFilter txt = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };
        File[] txtFiles = directory.listFiles(txt);
        if (txt != null) {
            for (File file : txtFiles) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Ошибка! Файлов с расширением txt не существует в данной директории! ");
        }
    }

    public static void fileRead(String nameFile) {
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(nameFile), StandardCharsets.UTF_8)) {

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
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}