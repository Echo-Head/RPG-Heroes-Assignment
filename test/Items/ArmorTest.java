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

    @Test
    void Armor_GetArmorTypeTest_ShouldPass() {
        Armor myArmor = new Armor("Leather Cuirass", ArmorType.LEATHER, 14, Slot.BODY, 10, 10, 10);
        ArmorType expected = ArmorType.LEATHER;
        ArmorType actual = myArmor.getArmorType();
        assertEquals(expected, actual);
    }

    @Test
    void Armor_GetSlotTest_ShouldPass() {
        Armor myArmor = new Armor("Leather Cuirass", ArmorType.LEATHER, 14, Slot.BODY, 10, 10, 10);
        Slot expected = Slot.BODY;
        Slot actual = myArmor.getSlot();
        assertEquals(expected, actual);
    }

    @Test
    void Armor_GetSlotTest_ShouldNotPass() {
        Armor myArmor = new Armor("Leather Cuirass", ArmorType.LEATHER, 14, Slot.BODY, 10, 10, 10);
        Slot unexpected = Slot.LEGS;
        Slot actual = myArmor.getSlot();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Armor_GetArmorAttribute_ShouldPass() {
        int strength = 5;
        int dexterity = 4;
        int intelligence = 3;
        Armor myArmor = new Armor("Leather Cuirass", ArmorType.LEATHER, 14, Slot.BODY, strength, dexterity, intelligence);
        int[] expected = {strength, dexterity, intelligence};
        int[] actual = {myArmor.getArmorAttribute().getStrength(), myArmor.getArmorAttribute().getDexterity(), myArmor.getArmorAttribute().getIntelligence()};
        assertArrayEquals(expected, actual);
    }
}