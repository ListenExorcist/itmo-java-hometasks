package ru.itmo.homeworks.hw13.base;

import ru.itmo.homeworks.hw13.units.Infantry;
import ru.itmo.homeworks.hw13.units.Knight;

import java.io.Serializable;

abstract public class BattleUnit extends Unit implements Serializable {
    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore){
        super(healthScore);
        if (attackScore < 1) {
            throw new IllegalArgumentException("attackScore дб больше 0");
        }
        this.attackScore = attackScore;
    }

    public int getAttackScore(){
        return attackScore;
    }

    abstract public void attack(BattleUnit enemy);

    public static BattleUnit getBattleUnit(){
        if (Math.random() > 0.5) {
            return new Infantry(30, 10, 5);
        } else {
            return new Knight(30, 10, 5);
        }
    }

    public static BattleUnit[] getBattleUnits(int count){
        BattleUnit[] units = new BattleUnit[count];
        for (int i = 0; i < units.length; i++) {
            units[i] = getBattleUnit();
        }
        return units;
    }
}
