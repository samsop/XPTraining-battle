package be.cegeka.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeaponTest {

    @Test
    public void magicPotionVersusMagicPotion() {
        MagicPotion weapon = new MagicPotion();
        Soldier soldier1 = new Soldier("naam");
        Soldier soldier2 = new Soldier("naam");

        soldier1.setWeapon(weapon);
        soldier2.setWeapon(weapon);

        Fight fight = new Fight(soldier1, soldier2);

        assertEquals(fight.getWinner(), soldier1);
    }

}
