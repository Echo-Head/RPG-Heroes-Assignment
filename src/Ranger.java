import Enums.WeaponType;
import Enums.ArmorType;
import java.util.Arrays;

public class Ranger extends Hero {
    public Ranger(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, 1, 7, 1);
        getValidWeaponTypes().add(WeaponType.BOW);
        getValidArmorTypes().addAll(Arrays.asList(ArmorType.LEATHER, ArmorType.MAIL));
    }
}
