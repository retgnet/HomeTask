package com.maximov.hw11;

public class Horse extends Animal {
    public Horse(String name, int stamina, double runningSpeed, double swimmingSpeed) {
        super(name, stamina, runningSpeed, swimmingSpeed);
    }

    @Override
    public double swim(int distance) {
        double time = -1;

        if (isTired) {
            System.out.println(name + " У животного появилось состояние усталости!");
            return time;
        }

        if (stamina < distance * 4) {
            System.out.println(name + " не хватило выносливости для плавания на " + distance + " метров!");
            isTired = true;
            return -1;
        }

        time = distance / swimmingSpeed;
        stamina -= distance * 4;
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
        return time;
    }
}
