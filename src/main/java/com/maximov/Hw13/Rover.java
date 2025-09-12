package com.maximov.Hw13;

public class Rover implements Transport {
    private String type;
    private int fuel;
    private final int MAX_FUEL = 200;

    public Rover() {
        this.type = "Внедорожник";
        this.fuel = MAX_FUEL;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void move(int distance, Terrain terrain) {
        if (fuel < distance) {
            System.out.println("Недостаточно топлива!");
            return;
        }
        fuel -= distance;
        System.out.println("Успешно пройдено!");
    }
}
