package com.maximov;


import com.maximov.Hw13.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Алексей");

        Car car = new Car();
        Horse horse = new Horse();
        Bicycle bicycle = new Bicycle();
        Rover rover = new Rover();

        human.move(5,Terrain.SWAMP);
        car.move(20,Terrain.PLAIN);
        horse.move(15,Terrain.SWAMP);
        rover.move(50,Terrain.SWAMP);
        bicycle.move(101, Terrain.PLAIN);
        human.sitOnTransport(horse);
        human.standUp();
    }
}