import Enums.ArmorType;
import Enums.WeaponType;
import Enums.Slot;
import Exceptions.InvalidArmorException;
import Exceptions.InvalidWeaponException;
import Heroes.Mage;
import Heroes.Ranger;
import Heroes.Rogue;
import Heroes.Warrior;
import Items.Armor;
import Items.Weapon;

public class Main {
        public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {

        // Classes
        Mage mage = new Mage("Gandalf");
        Warrior warrior = new Warrior("Aragorn");
        Rogue rogue = new Rogue("Frodo");
        Ranger ranger = new Ranger("Legolas");

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

        mage.equip(wand);
        mage.equip(clothHat);
        mage.display();
        System.out.println(mage.getEquipment());
        }
}
