package com.maximov;


import com.maximov.hw11.Cat;
import com.maximov.hw11.Horse;

public class Main {
    public static void main(String[] args){
        Horse horse = new Horse("mustang", 100,2,2);
        horse.info();
        horse.run(10);
        horse.swim(10);
        horse.info();
        Cat cat = new Cat("murzik", 20, 2, 2);
        cat.info();
        cat.run(10);
        cat.swim(10);
        cat.info();

    }
}