package Items;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Enums.*;
import Items.Armor;

class ArmorTest {

    @Test
    void Armor_GetItemNameTest_ShouldPass() {
        Armor myArmor = new Armor("Leather Cuirass", ArmorType.LEATHER, 1, Slot.BODY, 10, 10, 10);
        String expected = "Leather Cuirass";
        String actual = myArmor.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    void Armor_GetRequiredLevelTest_ShouldPass() {
        Armor myArmor = new Armor("Leather Cuirass", ArmorType.LEATHER, 14, Slot.BODY, 10, 10, 10);
        int expected = 14;
        int actual = myArmor.getRequiredLevel();
        assertEquals(expected, actual);
    }


}