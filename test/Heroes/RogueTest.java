package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RogueTest {

    @Test
    void Rogue_LevelUpTest_ShouldPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int expected = 2;
        int actual = rogue.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Rogue_LevelUpTest_ShouldNotPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int unexpected = 3;
        int actual = rogue.getLevel();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Rogue_LevelUpTest_StrengthIncrease_ShouldPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int expected = 3;
        int actual = rogue.getTotalAttributes().getStrength();
        assertEquals(expected, actual);
    }

    @Test
    void Rogue_LevelUpTest_StrengthIncrease_ShouldNotPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int unexpected = 6;
        int actual = rogue.getTotalAttributes().getStrength();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Rogue_LevelUpTest_DexterityIncrease_ShouldPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int expected = 10;
        int actual = rogue.getTotalAttributes().getDexterity();
        assertEquals(expected, actual);
    }

    @Test
    void Rogue_LevelUpTest_DexterityIncrease_ShouldNotPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int unexpected = 20;
        int actual = rogue.getTotalAttributes().getDexterity();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Rogue_LevelUpTest_IntelligenceIncrease_ShouldPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int expected = 2;
        int actual = rogue.getTotalAttributes().getIntelligence();
        assertEquals(expected, actual);
    }

    @Test
    void Rogue_LevelUpTest_IntelligenceIncrease_ShouldNotPass() {
        Rogue rogue = new Rogue("Samwise");
        rogue.levelUp();
        int unexpected = 4;
        int actual = rogue.getTotalAttributes().getIntelligence();
        assertNotEquals(unexpected, actual);
    }
}