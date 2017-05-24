package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private int id;

    private Soldier frontMan;

    private List<Soldier> soldiers = new ArrayList<Soldier>();

    private IHeadquarters headquarters;

    public Army() {

    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
        if (soldier == soldiers.get(0)) {
            this.frontMan = soldier;
        }
        soldier.setId(headquarters.ReportElistment(soldier.getName()));
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public Soldier getFrontMan() {
        return this.soldiers.get(0);
    }

    public void setNieuweFrontman(Soldier soldier) {
        this.frontMan = soldier;
    }

    public void removeDeadSoldier(Soldier soldier) {
        soldiers.remove(soldier);
    }


}
