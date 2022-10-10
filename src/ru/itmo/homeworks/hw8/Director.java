package ru.itmo.homeworks.hw8;

import ru.itmo.homeworks.hw8.base.Human;

public class Director extends Human {

    public Director(String name, int age) {
        super(name, age);
    }

    public void startLessons() {
        System.out.println("Занятия начались");
    }

    public void endLessons() {
        System.out.println("Заянтия закончились");
    }
}
