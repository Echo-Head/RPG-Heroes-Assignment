package Items;

import Enums.WeaponType;
import Enums.Slot;

public class Weapon extends Item {
    private final int weaponDamage;
    private final WeaponType weaponType;
    // Weapon constructor
    public Weapon(String itemName, WeaponType weaponType, int weaponDamage, int requiredLevel) {
        super(itemName, requiredLevel, Slot.WEAPON);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }

    // Getters
    public WeaponType getWeaponType() {
        return weaponType;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }
}