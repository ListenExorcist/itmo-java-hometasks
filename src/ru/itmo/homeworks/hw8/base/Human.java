package ru.itmo.homeworks.hw8.base;

public abstract class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть меньше 0");
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("имя не может быть null");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("имя не может быть пустым");
        }
        this.name = name;
    }
}
