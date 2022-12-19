package Heroes;

import Enums.ArmorType;
import Enums.WeaponType;

import java.util.Arrays;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, 1, 1, 8);
        getValidWeaponTypes().addAll(Arrays.asList(WeaponType.STAFF, WeaponType.WAND));
        getValidArmorTypes().add(ArmorType.CLOTH);
    }

    public void levelUp() {
        levelUp(1, 1,5);
    }
}
