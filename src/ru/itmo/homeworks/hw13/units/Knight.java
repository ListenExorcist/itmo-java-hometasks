package ru.itmo.homeworks.hw13.units;

import ru.itmo.homeworks.hw13.base.BattleUnit;

import java.io.Serializable;

public final class Knight extends BattleUnit implements Serializable {
    private int additionalHealth;

    public Knight(int healthScore, int attackScore, int additionalHealth) {
        super(healthScore, attackScore);
        if (additionalHealth < 1) {
            throw new IllegalArgumentException("additionalHealth не мб меньше 1");
        }
        this.additionalHealth = additionalHealth;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Knight атакует");
        enemy.minusHealth(this.attackScore);
        if (!enemy.isAlive()) this.plusHealth(this.additionalHealth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Knight knight = (Knight) o;

        if (additionalHealth != knight.additionalHealth) {
            return false;
        }
        if (attackScore != knight.attackScore) {
            return false;
        }
        return healthScore == knight.healthScore;
    }

    @Override
    public int hashCode() {
        return (additionalHealth * 31 + healthScore) * 31 + attackScore;
    }
}
