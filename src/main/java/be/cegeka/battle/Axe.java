package be.cegeka.battle;


public class Axe extends Weapon {

    public Axe() {
        super.setDamage(3);
    }

    @Override
    public void calculateDamage(Weapon weapon) {
        Spear spear = new Spear();
        if (weapon == spear) {
            damage = 6;
        }
    }

}
