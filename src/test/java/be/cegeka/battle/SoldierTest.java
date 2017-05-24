package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void construction_ASoldierMustHaveAWeapon_BareFistDefault() {
        Soldier soldier = new Soldier("name");
        assertEquals(soldier.getWeapon().getClass(), BareFist.class);
    }

    @Test
    public void testSoldierWithAxeDamage() {
        Soldier soldier = new Soldier("name");
        Weapon weapon = new Axe();
        soldier.setWeapon(weapon);
        assertEquals(soldier.getWeapon().getDamage(), 3);
    }

    @Test
    public void testSoldierWithSwordDamage() {
        Soldier soldier = new Soldier("name");
        Weapon weapon = new Sword();
        soldier.setWeapon(weapon);
        assertEquals(soldier.getWeapon().getDamage(), 2);
    }

    @Test
    public void testSoldierWithBareFistDamage() {
        Soldier soldier = new Soldier("name");
        assertEquals(soldier.getWeapon().getDamage(), 1);
    }

    @Test
    public void testSoldierWithSpearDamage() {
        Soldier soldier = new Soldier("name");
        Weapon weapon = new Spear();
        soldier.setWeapon(weapon);
        assertEquals(soldier.getWeapon().getDamage(), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFightOnesSelf() {
        Soldier soldier = new Soldier("name");
        soldier.fight(soldier);
    }

    @Test
    public void testSwordVsBareHand() {
        Soldier soldier = new Soldier("name");
        Soldier soldier2 = new Soldier("naam2");
        Weapon weapon = new Sword();
        soldier2.setWeapon(weapon);
        assertEquals(soldier.fight(soldier2), soldier2);
    }

    @Test
    public void testSwordVsSword() {
        Soldier soldier = new Soldier("name");
        Soldier soldier2 = new Soldier("naam2");
        Weapon weapon = new Sword();
        soldier.setWeapon(weapon);
        soldier2.setWeapon(weapon);
        assertEquals(soldier.fight(soldier2), soldier);
    }


}