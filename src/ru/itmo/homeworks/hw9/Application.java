package ru.itmo.homeworks.hw9;

public class Application {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        for (Planet planet : planets) {
            System.out.println(planet);
        }
        System.out.println();
        Planet.VENUS.setMass(5_000_000_000_000_000_000_000_000d);
        Planet.VENUS.setRadius(6000);
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }
}
