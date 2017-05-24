package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private Soldier frontMan;

    private List<Soldier> soldiers = new ArrayList<Soldier>();

    public Army() {

    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
        if (soldier == soldiers.get(0)) {
            this.frontMan = soldier;
        }
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public Soldier getFrontMan() {
        return this.soldiers.get(0);
    }
}
