import Enums.WeaponType;
import Enums.Slot;

public class Weapon extends Item {

    private int weaponDamage;
    private WeaponType weaponType;
    // Weapon constructor
    public Weapon(String itemName, WeaponType weaponType, int weaponDamage, int requiredLevel) {
        super(itemName, requiredLevel, Slot.WEAPON);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }
    public WeaponType getWeaponType() {
        return weaponType;
    }
    // getter and setter methods for the weaponDamage property
    private int getWeaponDamage() {
        return this.weaponDamage;
    }
    private void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}