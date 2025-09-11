package com.maximov.user;

public class Box {
    // Поля класса
    private int width;
    private int height;
    private int depth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + color);
    }

    public void putItem(String item) {
        if (!isOpen) {
            System.out.println("Нельзя положить предмет - коробка закрыта!");
            return;
        }
        if (this.item != null) {
            System.out.println("В коробке уже есть предмет!");
            return;
        }
        this.item = item;
        System.out.println("Предмет " + item + " помещен в коробку");
    }

    public void removeItem() {
        if (!isOpen) {
            System.out.println("Нельзя достать предмет - коробка закрыта!");
            return;
        }
        if (this.item == null) {
            System.out.println("В коробке нет предмета!");
            return;
        }
        String removedItem = this.item;
        this.item = null;
        System.out.println("Предмет " + removedItem + " извлечен из коробки");
    }

    public void printInfo() {
        System.out.println("Информация о коробке:");
        System.out.println("Размеры: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет: " + color);
        System.out.println("Состояние: " + (isOpen ? "открыта" : "закрыта"));
        System.out.println("Содержимое: " + (item != null ? item : "пусто"));
        System.out.println();
    }


}
