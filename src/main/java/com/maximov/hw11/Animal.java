package com.maximov.hw11;
public class Animal {
    String name;
    double runningSpeed;
    double swimmingSpeed;
    int stamina;
    boolean isTired;

    public Animal(String name, int stamina, double runningSpeed, double swimmingSpeed) {
        this.name = name;
        this.stamina = stamina;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.isTired = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public boolean isTired() {
        return isTired;
    }

    public void setTired(boolean tired) {
        isTired = tired;
    }

    public double run(int distance) {
        double time = -1;

        if (isTired) {
            System.out.println(name + " У животного появилось состояние усталости!");
            return time;
        }

        if (stamina < distance) {
            System.out.println(name + " Не хватило выносливости для бега на " + distance + " метров!");
            isTired = true;
            return -1;
        }

        time = distance / runningSpeed;
        stamina -= distance;
        System.out.println(name + " Пробежал " + distance + " метров за " + time + " секунд");
        return time;
    }

    public double swim(int distance) {
        double time = -1;

        if (isTired) {
            System.out.println(name + " У животного появилось состояние усталости!");
            return time;
        }

        if (stamina < distance) {
            System.out.println(name + " не хватило выносливости для плавания на " + distance + " метров!");
            isTired = true;
            return -1;
        }

        time = distance / swimmingSpeed;
        stamina -= distance;
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
        return time;
    }

    public void info() {
        System.out.println("Информация о животном:");
        System.out.println("Имя: " + name);
        System.out.println("Выносливость: " + stamina);
        System.out.println("Состояние: " + (isTired ? "Усталое" : "Отдохнувшее"));
        System.out.println("Скорость бега: " + runningSpeed + " м/с");
        System.out.println("Скорость плавания: " + swimmingSpeed + " м/с");
        System.out.println();
    }


}
