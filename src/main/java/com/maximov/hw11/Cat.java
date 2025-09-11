package com.maximov.hw11;

public class Cat extends Animal {

    public Cat(String name, int stamina, double runningSpeed, double swimmingSpeed) {
        super(name, stamina, runningSpeed, swimmingSpeed);
    }

    @Override
    public double swim(int distance) {
        System.out.println("Коты не умеют плавать");
        return 0;
    }
}
