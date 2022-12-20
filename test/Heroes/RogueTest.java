package Heroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RogueTest {

    @Test
    void Rogue_LevelUpTest_ShouldPass() {
        Rogue rogue = new Rogue("Faramir");
        rogue.levelUp();
        int expected = 2;
        int actual = rogue.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Rogue_LevelUpTest_ShouldNotPass() {
        Rogue rogue = new Rogue("Faramir");
        rogue.levelUp();
        int unexpected = 3;
        int actual = rogue.getLevel();
        assertNotEquals(unexpected, actual);
    }

}