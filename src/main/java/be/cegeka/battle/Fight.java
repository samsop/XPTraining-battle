package be.cegeka.battle;

public class Fight {

    private Soldier attacker;

    private Soldier defender;

    public Fight(Soldier attacker, Soldier defender) {
        compareSoldier(attacker, defender);
        this.attacker = attacker;
        this.defender = defender;
    }

    private void compareSoldier(Soldier soldier, Soldier soldier2) {
        if (soldier == soldier2) {
            throw new IllegalArgumentException();
        }
    }

    public Soldier getWinner() {
        compareSoldier(attacker, defender);
        if (attacker.getWeapon().getDamage() >= defender.getWeapon().getDamage()) {
            return attacker;
        }
        return defender;
    }

    public Soldier getLoser() {
        compareSoldier(attacker, defender);
        if (attacker.getWeapon().getDamage() < defender.getWeapon().getDamage()) {
            return attacker;
        }
        return defender;
    }

}
