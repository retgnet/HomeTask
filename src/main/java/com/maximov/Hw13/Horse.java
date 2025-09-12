package com.maximov.Hw13;

public class Horse implements Transport {
    private String type;
    private int stamina;
    private final int MAX_STAMINA = 100;

    public Horse() {
        this.type = "Лошадь";
        this.stamina = MAX_STAMINA;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void move(int distance, Terrain terrain) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println("Лошадь не может бежать по болоту!");
            return;
        }
        if (stamina < distance) {
            System.out.println("Лошадь устала!");
            return;
        }
        stamina -= distance;
        System.out.println("Успешно пройдено!");
    }
}
