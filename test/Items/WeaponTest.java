package Items;

import Enums.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    void Weapon_GetItemNameTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 1);
        String expected = "Cool Sword";
        String actual = weapon.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    void Weapon_GetRequiredLevelTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        int expected = 14;
        int actual = weapon.getRequiredLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Weapon_GetWeaponTypeTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        WeaponType expected = WeaponType.SWORD;
        WeaponType actual = weapon.getWeaponType();
        assertEquals(expected, actual);
    }

    @Test
    void Weapon_GetSlotTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        Slot expected = Slot.WEAPON;
        Slot actual = weapon.getSlot();
        assertEquals(expected, actual);
    }

    @Test
    void Weapon_GetSlotTest_ShouldNotPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        Slot unexpected = Slot.LEGS;
        Slot actual = weapon.getSlot();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Weapon_GetWeaponDamage_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        int expected = 1;
        int actual = weapon.getWeaponDamage();
        assertEquals(expected, actual);
    }
}