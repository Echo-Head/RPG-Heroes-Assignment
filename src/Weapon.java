import Enums.WeaponType;

public class Weapon extends Item {

    private int weaponDamage;

    public Weapon(String itemName, int weaponDamage) {
        super(itemName);
        this.weaponDamage = weaponDamage;
    }

}
