package com.maximov;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();

        appleBox.addFruit(new Apple(0.2));
        appleBox.addFruit(new Apple(0.25));
        orangeBox.addFruit(new Orange(0.3));
        orangeBox.addFruit(new Orange(0.35));

        System.out.println("Вес коробки с яблоками: " + appleBox.weight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());

        System.out.println("Веса коробок равны? " + appleBox.compare(orangeBox));

        appleBox.pourInto(anotherAppleBox);
        System.out.println("После пересыпания, вес второй коробки с яблоками: " + anotherAppleBox.weight());

    }
}