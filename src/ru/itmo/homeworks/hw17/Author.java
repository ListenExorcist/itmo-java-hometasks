package ru.itmo.homeworks.hw17;

public class Author {
    public String name;
    public String surname;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printFullName() {
        System.out.println(name + " " + surname);
    }

    public String getFullName() {
        return name + " " + surname;
    }
}