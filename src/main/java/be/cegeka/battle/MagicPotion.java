package be.cegeka.battle;


public class MagicPotion extends Weapon {

    public MagicPotion() {

    }

    @Override
    public void calculateDamage(Weapon weapon) {
        if (weapon.damage % 2 == 1) {
            damage = 0;
        }
        damage = 10;
    }
}
