package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
class MageTest {

    @Test
    void Mage_LevelUpTest_ShouldPass() {
        Mage mage = new Mage("Magicman");
        mage.levelUp();
        int expected = 2;
        int actual = mage.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Mage_LevelUpTest_ShouldNotPass() {
        Mage mage = new Mage("Magicman");
        mage.levelUp();
        int unexpected = 3;
        int actual = mage.getLevel();
        assertNotEquals(unexpected, actual);
    }
}