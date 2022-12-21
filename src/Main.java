import Enums.ArmorType;
import Enums.WeaponType;
import Enums.Slot;
import Exceptions.InvalidArmorException;
import Exceptions.InvalidWeaponException;
import Heroes.*;
import Items.Armor;
import Items.Weapon;

public class Main {
        public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {

        // Hero
        Hero myMage = new Mage("Gandalf");

        // Armor
        Armor clothHat = new Armor("Cloth Hat", ArmorType.CLOTH, 1, Slot.HEAD, 2, 3, 10 );

        // Weapon
        Weapon staff = new Weapon("Magic Staff", WeaponType.STAFF, 25, 1);

        myMage.equip(staff);
        myMage.equip(clothHat);
        myMage.display();
        }
}
