import Enums.ArmorType;
import Enums.Slot;

public class Armor extends Item {
    private HeroAttribute armorAttribute;
    private ArmorType armorType;

    // Weapon constructor
    public Armor(String itemName, ArmorType armorType, int requiredLevel, Slot slot, int STR, int DEX, int INT) {
        super(itemName, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttribute = new HeroAttribute(STR, DEX, INT);
    }
    // Getter and setter methods for the armorAttribute property
    /*private int getArmorAttribute() {
        return this.armorAttribute;
    }
    private void setArmorAttribute(int armorAttribute) {
        this.armorAttribute = armorAttribute;
    }*/
}
