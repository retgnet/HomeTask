package com.maximov;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        if(plate.decreaseFood(appetite)){
            isFull = true;
        }
    }


}
