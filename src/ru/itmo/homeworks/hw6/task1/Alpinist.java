package ru.itmo.homeworks.hw6.task1;

public class Alpinist {
    private String name, address;

    public Alpinist(String name, String address) {
        setName(name);
        setAddress(address);
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("имя не может быть null");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("имя не может быть менее 3-х символов");
        }
        this.name = name;
    }

    private void setAddress(String address) {
        if (name == null) {
            throw new IllegalArgumentException("адресс не может быть null");
        }
        if (name.length() < 5) {
            throw new IllegalArgumentException("адресс не может быть менее 5-ти символов");
        }
        this.address = address;
    }
}
