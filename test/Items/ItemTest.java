package Items;

import Enums.*;
import Items.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void Item_GetNameTest_ShouldPass() {
    Item item = new Armor("Plate Armor", ArmorType.PLATE, 2, Slot.BODY, 5, 5, 5);
    String expected = "Plate Armor";
    String actual = item.getItemName();
    assertEquals(expected, actual);
    }

    @Test
    void Item_GetRequiredLevelTest_ShouldPass() {
        Item item = new Armor("Plate Armor", ArmorType.PLATE, 2, Slot.BODY, 5, 5, 5);
        int expected = 2;
        int actual = item.getRequiredLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Item_GetSlotTest_ShouldPass() {
        Item item = new Armor("Plate Armor", ArmorType.PLATE, 2, Slot.BODY, 5, 5, 5);
        Slot expected = Slot.BODY;
        Slot actual = item.getSlot();
        assertEquals(expected, actual);
    }
}