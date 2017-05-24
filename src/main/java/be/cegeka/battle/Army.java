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

    public void setNieuweFrontman(Soldier soldier) {
        this.frontMan = soldier;
    }

    public void removeDeadSoldier(Soldier soldier) {
        soldiers.remove(soldier);
    }

    public Army fight(Army enemy) {
        while (!this.getSoldiers().isEmpty() && !enemy.getSoldiers().isEmpty()) {
            Fight fight = new Fight(this.getFrontMan(), enemy.getFrontMan());
            if (enemy.getFrontMan() == fight.getLoser()) {
                enemy.removeDeadSoldier(fight.getLoser());
                if (!enemy.getSoldiers().isEmpty()) {
                    enemy.setNieuweFrontman(enemy.getSoldiers().get(0));
                }
            }
            this.removeDeadSoldier(fight.getLoser());
            if (!this.getSoldiers().isEmpty()) {
                this.setNieuweFrontman(this.getSoldiers().get(0));
            }

        }
        if (this.getSoldiers().isEmpty()) {
            return enemy;
        } else {
            return this;
        }

    }

}
