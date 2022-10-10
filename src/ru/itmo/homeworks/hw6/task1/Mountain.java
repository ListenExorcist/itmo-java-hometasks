package ru.itmo.homeworks.hw6.task1;

public class Mountain {
    private String name, country;
    private int height;

    public Mountain(String name, String country, int height) {
        setName(name);
        setCountry(country);
        setHeight(height);
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("имя не может быть null");
        }
        if (name.length() < 4) {
            throw new IllegalArgumentException("имя не может быть менее 4-х символов");
        }
        this.name = name;
    }

    private void setCountry(String country) {
        if (country == null) {
            throw new IllegalArgumentException("страна не может быть null");
        }
        if (country.length() < 4) {
            throw new IllegalArgumentException("страна не может быть менее 4-х символов");
        }
        this.country = country;
    }

    private void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("высота не может быть меньше 100");
        }
        this.height = height;
    }
}
