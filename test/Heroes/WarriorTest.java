package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class WarriorTest {

    @Test
    void Warrior_LevelUpTest_ShouldPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int expected = 2;
        int actual = warrior.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Warrior_LevelUpTest_ShouldNotPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int unexpected = 6;
        int actual = warrior.getLevel();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Warrior_LevelUpTest_StrengthIncrease_ShouldPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int expected = 8;
        int actual = warrior.getTotalAttributes().getStrength();
        assertEquals(expected, actual);
    }

    @Test
    void Warrior_LevelUpTest_StrengthIncrease_ShouldNotPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int unexpected = 16;
        int actual = warrior.getTotalAttributes().getStrength();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Warrior_LevelUpTest_DexterityIncrease_ShouldPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int expected = 4;
        int actual = warrior.getTotalAttributes().getDexterity();
        assertEquals(expected, actual);
    }

    @Test
    void Warrior_LevelUpTest_DexterityIncrease_ShouldNotPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int unexpected = 8;
        int actual = warrior.getTotalAttributes().getDexterity();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Warrior_LevelUpTest_IntelligenceIncrease_ShouldPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int expected = 2;
        int actual = warrior.getTotalAttributes().getIntelligence();
        assertEquals(expected, actual);
    }

    @Test
    void Warrior_LevelUpTest_IntelligenceIncrease_ShouldNotPass() {
        Warrior warrior = new Warrior("Boromir");
        warrior.levelUp();
        int unexpected = 4;
        int actual = warrior.getTotalAttributes().getIntelligence();
        assertNotEquals(unexpected, actual);
    }
}