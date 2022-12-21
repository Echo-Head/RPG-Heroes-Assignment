package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
class MageTest {

    @Test
    void Mage_LevelUpTest_ShouldPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int expected = 2;
        int actual = mage.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Mage_LevelUpTest_ShouldNotPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int unexpected = 3;
        int actual = mage.getLevel();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Mage_LevelUpTest_StrengthIncrease_ShouldPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int expected = 2;
        int actual = mage.getTotalAttributes().getStrength();
        assertEquals(expected, actual);
    }

    @Test
    void Mage_LevelUpTest_StrengthIncrease_ShouldNotPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int unexpected = 4;
        int actual = mage.getTotalAttributes().getStrength();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Mage_LevelUpTest_DexterityIncrease_ShouldPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int expected = 2;
        int actual = mage.getTotalAttributes().getDexterity();
        assertEquals(expected, actual);
    }

    @Test
    void Mage_LevelUpTest_DexterityIncrease_ShouldNotPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int unexpected = 4;
        int actual = mage.getTotalAttributes().getDexterity();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Mage_LevelUpTest_IntelligenceIncrease_ShouldPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int expected = 13;
        int actual = mage.getTotalAttributes().getIntelligence();
        assertEquals(expected, actual);
    }

    @Test
    void Mage_LevelUpTest_IntelligenceIncrease_ShouldNotPass() {
        Mage mage = new Mage("Saruman");
        mage.levelUp();
        int unexpected = 26;
        int actual = mage.getTotalAttributes().getIntelligence();
        assertNotEquals(unexpected, actual);
    }
}