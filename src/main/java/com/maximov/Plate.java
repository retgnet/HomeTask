package com.maximov;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void addFood(int countFood){
        currentFood = Math.min(maxFood, currentFood + countFood);
    }
    public boolean decreaseFood(int countFood){
        if(currentFood - countFood >= 0){
            currentFood -= countFood;
            return true;
        }
        else{
            return false;
        }

    }
}
