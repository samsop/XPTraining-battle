package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private int id;

    private Weapon weapon;


    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));
        this.weapon = new BareFist();
        this.name = name;
    }

    String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
