package Items;

import Enums.*;
import Items.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeaponTest {

    @Test
    void Armor_GetItemNameTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 1);
        String expected = "Cool Sword";
        String actual = weapon.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    void Armor_GetRequiredLevelTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        int expected = 14;
        int actual = weapon.getRequiredLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Armor_GetWeaponTypeTest_ShouldPass() {
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 14);
        WeaponType expected = WeaponType.SWORD;
        WeaponType actual = weapon.getWeaponType();
        assertEquals(expected, actual);
    }
}