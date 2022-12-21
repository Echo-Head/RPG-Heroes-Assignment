package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RangerTest {

    @Test
    void Ranger_LevelUpTest_ShouldPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int expected = 2;
        int actual = ranger.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Ranger_LevelUpTest_ShouldNotPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int unexpected = 3;
        int actual = ranger.getLevel();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Ranger_LevelUpTest_StrengthIncrease_ShouldPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int expected = 2;
        int actual = ranger.getTotalAttributes().getStrength();
        assertEquals(expected, actual);
    }

    @Test
    void Ranger_LevelUpTest_StrengthIncrease_ShouldNotPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int unexpected = 4;
        int actual = ranger.getTotalAttributes().getStrength();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Ranger_LevelUpTest_DexterityIncrease_ShouldPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int expected = 12;
        int actual = ranger.getTotalAttributes().getDexterity();
        assertEquals(expected, actual);
    }

    @Test
    void Ranger_LevelUpTest_DexterityIncrease_ShouldNotPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int unexpected = 24;
        int actual = ranger.getTotalAttributes().getDexterity();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Ranger_LevelUpTest_IntelligenceIncrease_ShouldPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int expected = 2;
        int actual = ranger.getTotalAttributes().getIntelligence();
        assertEquals(expected, actual);
    }

    @Test
    void Ranger_LevelUpTest_IntelligenceIncrease_ShouldNotPass() {
        Ranger ranger = new Ranger("Faramir");
        ranger.levelUp();
        int unexpected = 4;
        int actual = ranger.getTotalAttributes().getIntelligence();
        assertNotEquals(unexpected, actual);
    }
}