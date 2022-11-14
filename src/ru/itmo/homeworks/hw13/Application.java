package ru.itmo.homeworks.hw13;

import ru.itmo.homeworks.hw13.base.BattleUnit;
import ru.itmo.homeworks.hw13.handlers.BinHandler;
import ru.itmo.homeworks.hw13.units.Infantry;
import ru.itmo.homeworks.hw13.units.King;
import ru.itmo.homeworks.hw13.units.Knight;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        King king = new King(2000);
        king.generateArmy();
        Infantry infantry = new Infantry(30, 10, 5);
        Knight knight = new Knight(30, 10, 5);
        Kingdom kingdom = new Kingdom(king);
        kingdom.addBattleUnit(infantry);
        kingdom.addBattleUnit(knight);

        BinHandler<Kingdom> kingdomHandler = new BinHandler<>();
        kingdomHandler.writeToFile(kingdom);
        Kingdom kingdomFromFile = kingdomHandler.readFromFile();

        System.out.println(kingdom.equals(kingdomFromFile));
    }
}
