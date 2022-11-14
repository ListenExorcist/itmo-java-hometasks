package ru.itmo.homeworks.hw13;

import ru.itmo.homeworks.hw13.base.BattleUnit;
import ru.itmo.homeworks.hw13.base.Unit;
import ru.itmo.homeworks.hw13.units.King;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Kingdom implements Serializable {
    King king;
    List<BattleUnit> battleUnits;

    public Kingdom(King king) {
        this.king = king;
        battleUnits = new ArrayList<>();
    }

    public void addBattleUnit(BattleUnit battleUnit) {
        battleUnits.add(battleUnit);
    }

    public void removeBattleUnit(BattleUnit battleUnit) {
        battleUnits.remove(battleUnit);
    }

    public King getKing() {
        return king;
    }

    public List<BattleUnit> getBattleUnits() {
        return battleUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kingdom kingdom = (Kingdom) o;

        if (king != null ? !king.equals(kingdom.king) : kingdom.king != null) return false;
        if (battleUnits.size() != kingdom.battleUnits.size()) return false;
        for (int i = 0; i < battleUnits.size(); i++) {
            if (!battleUnits.get(i).equals(kingdom.battleUnits.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = king != null ? king.hashCode() : 0;
        result = 31 * result + (battleUnits != null ? battleUnits.hashCode() : 0);
        return result;
    }
}
