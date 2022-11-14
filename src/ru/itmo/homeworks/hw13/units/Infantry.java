package ru.itmo.homeworks.hw13.units;

import ru.itmo.homeworks.hw13.base.BattleUnit;

import java.io.Serializable;

public final class Infantry extends BattleUnit implements Serializable {
    private int additionalAttack;

    public Infantry(int healthScore, int attackScore, int additionalAttack) {
        super(healthScore, attackScore);
        if (additionalAttack < 1) {
            throw new IllegalArgumentException("additionalAttack не мб меньше 1");
        }
        this.additionalAttack = additionalAttack;
    }

    public void upAdditionalAttack(){
        additionalAttack += (int) (Math.random() * 3);
    }

    @Override
    public void attack(BattleUnit enemy){
        System.out.println("Infantry атакует");
        enemy.minusHealth(this.attackScore);
        if (Math.random() < 0.5) enemy.minusHealth(this.additionalAttack);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Infantry infantry = (Infantry) o;

        if (additionalAttack != infantry.additionalAttack) {
            return false;
        }
        if (attackScore != infantry.attackScore) {
            return false;
        }
        return healthScore == infantry.healthScore;
    }

    @Override
    public int hashCode() {
        return (additionalAttack * 31 + healthScore) * 31 + attackScore;
    }
}
