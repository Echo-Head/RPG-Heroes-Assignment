package Heroes;

import Enums.ArmorType;
import Enums.WeaponType;
import java.util.Arrays;

public class Rogue extends Hero {
    // Rogue constructor
    public Rogue(String name) {
        super(name, 2, 6, 1);
        getValidWeaponTypes().addAll(Arrays.asList(WeaponType.DAGGER, WeaponType.SWORD));
        getValidArmorTypes().addAll(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL));
    }

    // Define the attribute increase at levelUp
    public void levelUp() {
        levelUp(1, 4,1);
    }
}