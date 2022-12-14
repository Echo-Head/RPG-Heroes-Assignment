import Enums.ArmorType;
import Enums.Slot;

public class Armor extends Item {
    private final HeroAttribute armorAttribute;
    private final ArmorType armorType;

    // Weapon constructor
    public Armor(String itemName, ArmorType armorType, int requiredLevel, Slot slot, int strength, int dexterity, int intelligence) {
        super(itemName, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttribute = new HeroAttribute(strength, dexterity, intelligence);
    }
    // Getters
    public HeroAttribute getArmorAttribute() {
        return armorAttribute;
    }
    public ArmorType getArmorType() { return armorType; }
}
