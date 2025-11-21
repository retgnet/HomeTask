package com.maximov;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        return Math.abs(this.weight() - otherBox.weight()) < 0.001;
    }

    public void pourInto(Box<T> targetBox) {
        targetBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public List<T> getFruits() {
        return fruits;
    }
}
