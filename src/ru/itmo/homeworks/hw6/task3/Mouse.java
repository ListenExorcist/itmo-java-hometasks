package ru.itmo.homeworks.hw6.task3;

public class Mouse {
    private double speed;

    public Mouse(double speed) {
        setSpeed(speed);
    }

    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("скорость должна быть больше 0");
        }
        this.speed = speed;
    }
}
