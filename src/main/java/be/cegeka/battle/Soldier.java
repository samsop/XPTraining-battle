package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private Weapon weapon;


    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));
        this.weapon = new BareFist();
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private void compareSoldier(Soldier soldier, Soldier soldier2) {
        if (soldier == soldier2) {
            throw new IllegalArgumentException();
        }
    }

    public Soldier fight(Soldier defender) {
        compareSoldier(this, defender);
        if (this.getWeapon().getDamage() >= defender.getWeapon().getDamage()) {
            return this;
        }
        return defender;
    }

}
