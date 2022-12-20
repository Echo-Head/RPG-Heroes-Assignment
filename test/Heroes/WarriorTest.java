package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class WarriorTest {

    @Test
    void Warrior_LevelUpTest_ShouldPass() {
        Warrior warrior = new Warrior("Faramir");
        warrior.levelUp();
        int expected = 2;
        int actual = warrior.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Warrior_LevelUpTest_ShouldNotPass() {
        Warrior warrior = new Warrior("Faramir");
        warrior.levelUp();
        int unexpected = 3;
        int actual = warrior.getLevel();
        assertNotEquals(unexpected, actual);
    }
}