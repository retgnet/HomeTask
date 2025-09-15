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
    public boolean move(int distance, Terrain terrain) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println("Велосипед не может передвигаться по болоту!");
            return false;
        }
        if (driverStamina < distance) {
            System.out.println("Гонщик устал!");
            return false;
        }
        driverStamina -= distance;
        System.out.println("Успешно пройдено!");
        return true;
    }
}
