package be.cegeka.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArmyTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void anArmyMustHaveASoldier() {
        Army army = new Army();
        army.getSoldiers().get(0);
    }

    @Test
    public void firstEnlistedSoldierMustBeFrontman() {
        Army army = new Army();
        Soldier soldier = new Soldier("naam");
        army.addSoldier(soldier);
        assertEquals(army.getFrontMan(), soldier);
    }

    @Test(expected = AssertionError.class)
    public void OtherEnlistedSoldiersAreNoFrontmen() {
        Army army = new Army();
        Soldier soldier1 = new Soldier("naam");
        Soldier soldier2 = new Soldier("naam");
        army.addSoldier(soldier1);
        army.addSoldier(soldier2);
        assertEquals(army.getFrontMan(), soldier2);
    }
}
