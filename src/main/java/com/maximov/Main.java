package com.maximov;

import com.maximov.user.Box;
import com.maximov.user.User;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1975, "ivan@example.com"),
                new User("Петров", "Петр", "Петрович", 1985, "petr@example.com"),
                new User("Сидоров", "Сидор", "Сидорович", 1965, "sidor@example.com"),
                new User("Кузнецов", "Андрей", "Владимирович", 1990, "andrey@example.com"),
                new User("Васильев", "Василий", "Васильевич", 1970, "vasiliy@example.com"),
                new User("Михайлов", "Михаил", "Михайлович", 1980, "mihail@example.com"),
                new User("Алексеев", "Алексей", "Алексеевич", 1960, "alexey@example.com"),
                new User("Николаев", "Николай", "Николаевич", 1995, "nikolay@example.com"),
                new User("Сергеев", "Сергей", "Сергеевич", 1978, "sergey@example.com"),
                new User("Орлов", "Олег", "Олегович", 1968, "oleg@example.com")
        };
        for (User user : users) {
            if (user.getAge() > 40) {
                System.out.println(user.toString());
            }
        }

        Box box = new Box(10, 20, 15, "красный");


        box.printInfo();


        box.putItem("книга");
        box.open();

        box.putItem("книга");

        box.repaint("зеленый");

        box.printInfo();

        box.removeItem();

        box.close();

    }


}