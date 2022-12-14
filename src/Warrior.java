import Enums.ArmorType;
import Enums.WeaponType;
import java.util.Arrays;

public class Warrior extends Hero {
    public Warrior(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, 5, 2, 1);
        getValidWeaponTypes().addAll(Arrays.asList(WeaponType.AXE, WeaponType.HAMMER, WeaponType.SWORD));
        getValidArmorTypes().addAll(Arrays.asList(ArmorType.MAIL, ArmorType.PLATE));
    }
}

