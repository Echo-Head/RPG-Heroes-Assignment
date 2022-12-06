import java.util.*;

public abstract class Hero {

    private final String HeroName = "name";
    private final int StartLevel = 1;
    private int LevelAttributes;
    public HashMap<Slot, Item> Equipment = new HashMap<Slot, Item>();

    enum HeroClasses {
        MAGE, ROGUE, RANGER, WARRIOR
    }


    public void CreateHero(String HeroName) {}
    public void LevelUp() {}
    public void EquipWeapon() {}
    public void EquipArmor() {}
    public void Damage() {}
    public void TotalAttributes() {}
    public void Display() {}

}
