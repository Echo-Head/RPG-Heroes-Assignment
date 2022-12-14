import Enums.ArmorType;
import Enums.WeaponType;

import java.util.Arrays;

public class Rogue extends Hero {
    public Rogue(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, 2, 6, 1);
        getValidWeaponTypes().addAll(Arrays.asList(WeaponType.DAGGER, WeaponType.SWORD));
        getValidArmorTypes().addAll(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL));
    }
}