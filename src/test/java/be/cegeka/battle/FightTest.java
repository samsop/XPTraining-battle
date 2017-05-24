package be.cegeka.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FightTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFightOnesSelf() {
        Soldier soldier = new Soldier("name");
        new Fight(soldier, soldier);
    }

    @Test
    public void testSwordVsBareHand() {
        Soldier soldier = new Soldier("name");
        Soldier soldier2 = new Soldier("naam2");
        Weapon weapon = new Sword();
        soldier2.setWeapon(weapon);
        Fight fight = new Fight(soldier, soldier2);
        assertEquals(fight.getWinner(), soldier2);
    }

    @Test
    public void testSwordVsSword() {
        Soldier soldier = new Soldier("name");
        Soldier soldier2 = new Soldier("naam2");
        Weapon weapon = new Sword();
        soldier.setWeapon(weapon);
        soldier2.setWeapon(weapon);
        Fight fight = new Fight(soldier, soldier2);
        assertEquals(fight.getWinner(), soldier);
    }

}
