package ru.itmo.homeworks.hw9;

public enum Planet {
    MERCURY(333_022_000_000_000_000_000_000d, 2439.7, "Меркурий"),
    VENUS(4_867_500_000_000_000_000_000_000d, 6051.8, "Венера"),
    EARTH(5_972_600_000_000_000_000_000_000d, 6371, "Земля");

    private double mass, radius;
    private String name;

    Planet(double mass, double radius, String name) {
        this.mass = mass;
        this.radius = radius;
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Планета{" +
                "масса=" + mass + " кг; " +
                "радиус=" + radius + " км; " +
                "название=" + name +
                '}';
    }
}
