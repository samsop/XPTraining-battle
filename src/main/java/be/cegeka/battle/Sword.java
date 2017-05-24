package be.cegeka.battle;


public class Sword extends Weapon {

    public Sword() {
        super.setDamage(2);
    }

    @Override
    public void calculateDamage(Weapon weapon) {
        Axe axe = new Axe();
        if (weapon == axe) {
            damage = 5;
        }
    }
}
