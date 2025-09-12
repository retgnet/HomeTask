package com.maximov.Hw13;

import com.sun.jdi.connect.Transport;

public class Human {
    private String name;
    private Transport currentTransport;
    private int stamina;
    private final int MAX_STAMINA = 500;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
        this.stamina = MAX_STAMINA;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void sitOnTransport(Transport transport) {
        currentTransport = transport;
        System.out.println(name + " сел на " + currentTransport.getClass());
    }

    public void standUp() {
        if (currentTransport != null) {
            System.out.println(name + " встал с " + currentTransport.getClass());
            currentTransport = null;
        }
    }

    public void move(int distance, Terrain terrain) {
        if (currentTransport == null) {
            if (terrain.equals(Terrain.SWAMP)) {
                System.out.println("Человеку трудно идти по болоту");
                stamina -= distance * 2;
            } else {
                stamina -= distance;
            }
        }
    }
}
