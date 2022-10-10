package ru.itmo.homeworks.hw6.task3;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 9.2, 3);
        Cat cat2 = new Cat("Снежок", 9.5, 2.5);
        Mouse mouse1 = new Mouse(8);
        Mouse mouse2 = new Mouse(9.7);
        Mouse mouse3 = new Mouse(9);
        Mouse mouse4 = new Mouse(11);
        Mouse mouse5 = new Mouse(9);
        Mouse mouse6 = new Mouse(8);
        Mouse mouse7 = new Mouse(10);
        Mouse mouse8 = new Mouse(11);
        Mouse mouse9 = new Mouse(9.4);
        Mouse mouse10 = new Mouse(8.9);

        cat1.catchMouse(mouse1);
        cat1.catchMouse(mouse2);
        cat1.catchMouse(mouse3);
        cat1.catchMouse(mouse4);
        cat1.catchMouse(mouse5);
        cat2.catchMouse(mouse6);
        cat2.catchMouse(mouse7);
        cat2.catchMouse(mouse8);
        cat2.catchMouse(mouse9);
        cat2.catchMouse(mouse10);

        cat1.attackCat(cat2);
    }
}
