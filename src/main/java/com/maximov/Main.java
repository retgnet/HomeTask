package com.maximov;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {
                new Cat("Барсик", 20),
                new Cat("Брелок", 30),
                new Cat("Белка", 40),
                new Cat("Морковка", 50),
                new Cat("Мурзик", 10)
        };

        for (Cat cat : cats){
            cat.eat(plate);
        }

        for (Cat cat : cats){
            System.out.println(cat.getName() + " сыт " + cat.isFull());
        }
        System.out.println("Еды осталось: " + plate.getCurrentFood());
    }
}