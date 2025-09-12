package com.maximov.Hw13;

public class Bicycle implements Transport {
    private String type;
    private int driverStamina;
    private final int MAX_STAMINA = 80;

    public Bicycle() {
        this.type = "Велосипед";
        this.driverStamina = MAX_STAMINA;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void move(int distance, Terrain terrain) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println("Велосипед не может передвигаться по болоту!");
            return;
        }
        if (driverStamina < distance) {
            System.out.println("Гонщик устал!");
            return;
        }
        driverStamina -= distance;
        System.out.println("Успешно пройдено!");
    }
}
