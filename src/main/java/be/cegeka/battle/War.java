package be.cegeka.battle;


public class War {

    private IHeadquarters headquarters;

    private Army army1;

    private Army army2;


    public War(Army army1, Army army2) {
        this.army1 = army1;
        this.army2 = army2;
    }


    public Army getWinner() {
        while (!army1.getSoldiers().isEmpty() && !army2.getSoldiers().isEmpty()) {
            frontmanFight();
        }
        if (army1.getSoldiers().isEmpty()) {
            return army2;
        }
        return army1;
    }


    private void frontmanFight() {
        Fight fight = new Fight(army1.getFrontMan(), army2.getFrontMan());
        if (army2.getFrontMan() == fight.getLoser()) {
            army2.removeDeadSoldier(fight.getLoser());
            if (!army2.getSoldiers().isEmpty()) {
                army2.setNieuweFrontman(army2.getSoldiers().get(0));
            }
        }
        army1.removeDeadSoldier(fight.getLoser());
        if (!army1.getSoldiers().isEmpty()) {
            army1.setNieuweFrontman(army1.getSoldiers().get(0));
        }
    }


}
