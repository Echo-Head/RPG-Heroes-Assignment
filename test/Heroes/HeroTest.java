package Heroes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import Enums.*;
import Exceptions.*;
import Items.*;
import Heroes.Hero;
import Heroes.HeroAttribute;
import Heroes.Mage;
import Heroes.Rogue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void Hero_GetNameTest_ShouldPass() {
        String expected = "Lizard Wizard";
        Hero hero = new Rogue(expected);
        String actual = hero.getName();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetLevelTest_ShouldPass() {
        Hero hero = new Mage("Vivi");
        int expected = 1;
        int actual = hero.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetClassTest_ShouldPass() {
        Hero hero = new Rogue("Gollum");
        Class<Rogue> expected = Rogue.class;
        Class<? extends Hero> actual = hero.getClass();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetEquipmentTest_All_Slots_Empty() {
        Hero hero = new Mage("Genie");
        HashMap<Object, Object> expected = new HashMap<>();
        expected.put(Slot.HEAD, null);
        expected.put(Slot.BODY, null);
        expected.put(Slot.LEGS, null);
        expected.put(Slot.WEAPON, null);
        HashMap<Slot, Item> actual = hero.getEquipment();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetEquipmentTest_FilledSlots() throws InvalidWeaponException {
        Hero hero = new Rogue("Jerma");
        Weapon weapon = new Weapon("Cool Sword", WeaponType.SWORD, 1, 1);
        HashMap<Object, Object> expected = new HashMap<>();
        for (Slot slot : Slot.values()) {
            expected.put(slot, null);
        }
        expected.put(Slot.WEAPON, weapon);
        hero.equip(weapon);
        HashMap<Slot, Item> actual = hero.getEquipment();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetTotalAttributesTest_No_Equipment() {
        Hero hero = new Mage("Dude");
        HeroAttribute actualAttributes = hero.getTotalAttributes();
        int actualStrength = actualAttributes.getStrength();
        int actualDexterity = actualAttributes.getDexterity();
        int actualIntelligence = actualAttributes.getIntelligence();
        int[] expected = {1,1,8};
        int[] actual = {actualStrength, actualDexterity, actualIntelligence};
        assertArrayEquals(expected, actual);
    }

    @Test
    void Hero_GetTotalAttributesTest_With_OneArmorPiece() throws InvalidArmorException {
        Hero hero = new Rogue("Guy");
        Armor armor = new Armor("Leather Boots", ArmorType.LEATHER, 1, Slot.LEGS, 10, 10, 10);
        hero.equip(armor);
        HeroAttribute actualAttributes = hero.getTotalAttributes();
        int actualStrength = actualAttributes.getStrength();
        int actualDexterity = actualAttributes.getDexterity();
        int actualIntelligence = actualAttributes.getIntelligence();
        int[] expected = {12,16,11};
        int[] actual = {actualStrength, actualDexterity, actualIntelligence};
        assertArrayEquals(expected, actual);
    }

    @Test
    void Hero_GetTotalAttributesTest_With_TwoArmorPieces() throws InvalidArmorException {
        Hero hero = new Rogue("Guy");
        Armor armor1 = new Armor("Mail Armor", ArmorType.MAIL, 1, Slot.BODY, 10, 10, 10);
        Armor armor2 = new Armor("Leather Boots", ArmorType.LEATHER, 1, Slot.LEGS, 10, 10, 10);
        hero.equip(armor1);
        hero.equip(armor2);
        HeroAttribute actualAttributes = hero.getTotalAttributes();
        int actualStrength = actualAttributes.getStrength();
        int actualDexterity = actualAttributes.getDexterity();
        int actualIntelligence = actualAttributes.getIntelligence();
        int[] expected = {22,26,21};
        int[] actual = {actualStrength, actualDexterity, actualIntelligence};
        assertArrayEquals(expected, actual);
    }

    @Test
    void Hero_GetTotalAttributesTest_With_ReplacedArmorPiece() throws InvalidArmorException {
        Hero hero = new Rogue("Scoundrel");
        Armor armor1 = new Armor("Mail Armor", ArmorType.MAIL, 1, Slot.BODY, 10, 10, 10);
        hero.equip(armor1);
        Armor armor2 = new Armor("Leather Boots", ArmorType.LEATHER, 1, Slot.LEGS, 10, 10, 10);
        hero.equip(armor2);
        HeroAttribute actualAttributes = hero.getTotalAttributes();
        int actualStrength = actualAttributes.getStrength();
        int actualDexterity = actualAttributes.getDexterity();
        int actualIntelligence = actualAttributes.getIntelligence();
        int[] expected = {12,16,11};
        int[] actual = {actualStrength, actualDexterity, actualIntelligence};
        assertArrayEquals(expected, actual);
    }

    @Test
    void Hero_GetValidWeaponTypesTest_ShouldPass() {
        Hero hero = new Rogue("Swashbuckler");
        HashSet<Object> expected = new HashSet<>(Arrays.asList(WeaponType.DAGGER, WeaponType.SWORD));
        HashSet<WeaponType> actual = hero.getValidWeaponTypes();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetValidWeaponTypesTest_ShouldNotPass() {
        Hero hero = new Rogue("Swashbuckler");
        HashSet<Object> unexpected = new HashSet<>(Arrays.asList(WeaponType.AXE, WeaponType.HAMMER));
        HashSet<WeaponType> actual = hero.getValidWeaponTypes();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Hero_GetValidArmorTypesTest_ShouldPass() {
        Hero hero = new Rogue("Swashbuckler");
        HashSet<Object> expected = new HashSet<>(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL));
        HashSet<ArmorType> actual = hero.getValidArmorTypes();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_GetValidArmorTypesTest_ShouldNotPass() {
        Hero hero = new Rogue("Swashbuckler");
        HashSet<Object> unexpected = new HashSet<>(Arrays.asList(ArmorType.PLATE, ArmorType.CLOTH));
        HashSet<ArmorType> actual = hero.getValidArmorTypes();
        assertNotEquals(unexpected, actual);
    }

    @Test
    void Hero_CalculateDamageTest_NoWeapon() {
        Hero hero = new Mage("Magic Johnson");
        double expected = (1.0 + (5.0 / 100.0));
        double actual = hero.damage();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_CalculateDamageTest_WithWeapon() throws InvalidWeaponException {
        Hero hero = new Mage("Magic Mike");
        Weapon staff = new Weapon("Magic Stick", WeaponType.STAFF, 5, 1);
        hero.equip(staff);
        double expected = 5.0 * (1.0 + (5.0 / 100.0));
        double actual = hero.damage();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_CalculateDamageTest_WithWeaponReplaced() throws  InvalidWeaponException {
        Hero hero = new Mage("Magic Mike");
        Weapon wand = new Weapon("Fairy Wand", WeaponType.WAND, 2, 1);
        hero.equip(wand);
        Weapon staff = new Weapon("Magic Stick", WeaponType.STAFF, 5, 1);
        hero.equip(staff);
        double expected = 5.0 * (1.0 + (5.0 / 100.0));
        double actual = hero.damage();
        assertEquals(expected, actual);
    }

    @Test
    void Hero_CalculateDamageTest_WithWeapon_And_Armor() throws InvalidWeaponException, InvalidArmorException {
        Hero hero = new Mage("Magic Nathaniel");
        Weapon staff = new Weapon("Magic Stick", WeaponType.STAFF, 5, 1);
        Armor clothHat = new Armor("Cloth Hat", ArmorType.CLOTH, 1, Slot.HEAD, 10, 0, 0);
        hero.equip(staff);
        hero.equip(clothHat);
        double expected = 5.0 * (1.0 + (5.0 / 100.0));
        double actual = hero.damage();
        assertEquals(expected, actual);
    }
}
