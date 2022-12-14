import Enums.ArmorType;
import Enums.WeaponType;
import Enums.Slot;

public class Main {
        public static void main(String[] args) {

        // Classes
        Mage mage = new Mage("Gandalf", 9, 1, 1, 8);
        Warrior warrior = new Warrior("Aragorn", 4, 5, 2, 1);
        Rogue rogue = new Rogue("Frodo", 2, 2, 6, 1);
        Ranger ranger = new Ranger("Legolas", 3, 1, 7, 1);

        // Armor
        Armor chestPlate = new Armor("Chest Plate", ArmorType.PLATE, 20, Slot.BODY, 10, 5, 9);
        Armor leatherBoots = new Armor("Leather Boots", ArmorType.LEATHER, 20, Slot.LEGS, 5, 10, 10);
        Armor clothHat = new Armor("Cloth Hat", ArmorType.CLOTH, 20, Slot.HEAD, 5, 5, 10);
        Armor chainMail = new Armor("Chain Mail", ArmorType.MAIL, 20, Slot.BODY, 5, 5, 10 );

        // Weapons
        Weapon sword = new Weapon("Sword", WeaponType.SWORD, 10, 5);
        Weapon axe = new Weapon("Axe", WeaponType.AXE, 12, 4);
        Weapon dagger = new Weapon("Dagger", WeaponType.DAGGER, 8, 3);
        Weapon hammer = new Weapon("Hammer", WeaponType.HAMMER, 13, 2);
        Weapon staff = new Weapon("Staff", WeaponType.STAFF, 13, 1);
        Weapon wand = new Weapon("Wand", WeaponType.WAND, 10, 6);
        Weapon bow = new Weapon("Bow", WeaponType.BOW, 11, 7);

        }
}
