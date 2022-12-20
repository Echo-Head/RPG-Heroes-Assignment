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
}