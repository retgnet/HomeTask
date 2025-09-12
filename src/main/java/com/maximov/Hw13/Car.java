package com.maximov.Hw13;

import static com.maximov.Hw13.Terrain.*;

public class Car implements Transport {
    private String type;
    private int fuel;
    private final int MAX_FUEL = 50;

    public Car() {
        this.type = "Машина";
        this.fuel = MAX_FUEL;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void move(int distance, Terrain terrain) {
        if (terrain.equals(DENSE_FOREST) || terrain.equals(SWAMP)) {
            System.out.println("Машина не может двигаться в этой местности");
            return;
        }
        if (fuel < distance) {
            System.out.println("Недостаточно топлива");
            return;
        }
        fuel -= distance;
        System.out.println("Успешно пройдено!");
    }
}
