package Heroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MageTest {

    @Test
    void LevelUpTest_Level_ShouldPass() {
        Mage mage = new Mage("Magicman");
        mage.levelUp();
        int expected = 2;
        int actual = mage.getLevel();
        assertEquals(expected, actual);
    }
}