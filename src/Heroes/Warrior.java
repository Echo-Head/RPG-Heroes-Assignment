package Heroes;

import Enums.ArmorType;
import Enums.WeaponType;
import java.util.Arrays;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name, 5, 2, 1);
        getValidWeaponTypes().addAll(Arrays.asList(WeaponType.AXE, WeaponType.HAMMER, WeaponType.SWORD));
        getValidArmorTypes().addAll(Arrays.asList(ArmorType.MAIL, ArmorType.PLATE));
    }

    public void levelUp() {
        levelUp(3, 2,1);
    }
}

