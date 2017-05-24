package be.cegeka.battle;


public class Spear extends Weapon {

    public Spear() {
        super.setDamage(2);
    }

    @Override
    public void calculateDamage(Weapon weapon) {
        Sword sword = new Sword();
        if (weapon == sword) {
            damage = 5;
        }
    }
}
