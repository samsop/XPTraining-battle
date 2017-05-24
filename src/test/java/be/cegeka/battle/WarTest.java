package be.cegeka.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WarTest {


    @Test
    public void armyVsOtherArmy() {
        Army army = new Army();
        Soldier soldier = new Soldier("naam");
        army.addSoldier(soldier);

        Army army2 = new Army();
        Soldier soldier2 = new Soldier("naam");
        army2.addSoldier(soldier2);

        War war = new War(army, army2);

        assertEquals(war.getWinner(), army);
    }

    @Test
    public void bigArmyVsOtherArmy() {
        Army army = new Army();
        Soldier soldier = new Soldier("naam");
        Soldier soldier2 = new Soldier("naam");
        Soldier soldier3 = new Soldier("naam");
        Soldier soldier4 = new Soldier("naam");
        Soldier soldier5 = new Soldier("naam");
        Weapon weapon = new Axe();
        soldier3.setWeapon(weapon);
        army.addSoldier(soldier);
        army.addSoldier(soldier2);
        army.addSoldier(soldier3);
        army.addSoldier(soldier4);
        army.addSoldier(soldier5);

        Army army2 = new Army();
        Soldier enemy = new Soldier("naam");
        Soldier enemy2 = new Soldier("naam");
        Soldier enemy3 = new Soldier("naam");
        Weapon weapon2 = new Sword();
        enemy.setWeapon(weapon2);
        army2.addSoldier(enemy);
        army2.addSoldier(enemy2);
        army2.addSoldier(enemy3);

        War war = new War(army, army2);

        assertEquals(war.getWinner(), army);
    }
}
