package ru.itmo.homeworks.hw13.units;

import ru.itmo.homeworks.hw13.base.AppSettings;
import ru.itmo.homeworks.hw13.base.BattleUnit;
import ru.itmo.homeworks.hw13.base.Unit;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class King extends Unit implements Serializable {
    private int gold = AppSettings.GOLD;

    private BattleUnit[] army;

    public King(int healthScore) {
        super(healthScore);
    }

    public int getGold() {
        return gold;
    }

    public void generateArmy() {
        if (gold < AppSettings.ARMY_PRICE) {
            System.out.println("Стоимость армии " + AppSettings.ARMY_PRICE);
            return;
        }
        gold -= AppSettings.ARMY_PRICE;
        army = BattleUnit.getBattleUnits(AppSettings.UNITS_COUNT);
    }

    public void updateArmy() {
        for (int i = 0; i < army.length; i++) {
            if (gold < AppSettings.UNIT_PRICE) {
                System.out.println("Стоимость юнита " + AppSettings.UNIT_PRICE);
                return;
            }
            if (!army[i].isAlive()) {
                gold -= AppSettings.UNIT_PRICE;
                army[i] = BattleUnit.getBattleUnit();
            }
        }
    }


    public void startBattle(King enemy) {
        Random random = new Random();
        for (BattleUnit battleUnit : army) {
            int enemyUnit = random.nextInt(enemy.army.length);
            if (enemy.army[enemyUnit].isAlive()) {
                battleUnit.attack(enemy.army[enemyUnit]);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        King king = (King) o;

        if (gold != king.gold) return false;
        if (healthScore != king.healthScore) return false;
        return Arrays.equals(army, king.army);
    }

    @Override
    public int hashCode() {
        int result = gold;
        result = 31 * result + Arrays.hashCode(army);
        result = 31 * result + healthScore;
        return result;
    }

    @Override
    public void rest() {
        if (gold < AppSettings.REST_PRICE) return;
        gold -= AppSettings.REST_PRICE;

        super.rest();

        System.out.println("King восстанавливает силы");
    }

    public final void rest(Unit unit) {
        if (gold < 20) return;
        gold -= 20;
        plusHealth(2);
        unit.plusHealth(1);
        System.out.println("King и Unit восстанавливают силы");
    }
}
