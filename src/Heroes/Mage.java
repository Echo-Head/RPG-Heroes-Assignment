package Heroes;

import Enums.ArmorType;
import Enums.WeaponType;

import java.util.Arrays;

public class Mage extends Hero {
    // Mage constructor
    public Mage(String name) {
        super(name, 1, 1, 8);
        getValidWeaponTypes().addAll(Arrays.asList(WeaponType.STAFF, WeaponType.WAND));
        getValidArmorTypes().add(ArmorType.CLOTH);
    }

    // Define the attribute increase at levelUp
    public void levelUp() {
        levelUp(1, 1,5);
    }
}
