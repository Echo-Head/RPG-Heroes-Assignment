import java.util.*;
import Enums.Slot;

public abstract class Hero {

    private String name;
    private String heroClass;
    private int strength;
    private int dexterity;
    private int intelligence;
    private final int startLevel = 1;
    private int startXP;
    private int levelAttributes;
    private int damage;
    HashMap<Slot, Item> equipment = new HashMap<Slot, Item>();
    List<String> validWeaponTypes;
    List<String> validArmorTypes;

    public Hero(String name) {
        this.name = name;

        // Initialize the validWeaponTypes & validArmorTypes list
        this.validWeaponTypes = new ArrayList<>();
        this.validArmorTypes = new ArrayList<>();
    }

    // createHero method
    public void createHero(String name) {
    }

    // Getter and setter methods for the name property
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // levelUp method
    public void levelUp() {
        this.startLevel += 1;
    }

    // equipWeapon method
    public void equipWeapon(String itemName) {
        equip("weapon", itemName);
    }

    // equipArmor method
    public void equipArmor(String itemName) {
        equip("armor", itemName);
    }

    // damage method
    public void damage() {}

    // totalAttributes method
    public void totalAttributes() {}

    // display method
    public String display() {
        StringBuilder heroDisplay = new StringBuilder();
        heroDisplay.append("Name: " + name + "\n");
        heroDisplay.append("Class: " + heroClass + "\n");
        heroDisplay.append("Level: " + startLevel + "\n");
        heroDisplay.append("Total strength: " + strength + "\n");
        heroDisplay.append("Total dexterity: " + dexterity + "\n");
        heroDisplay.append("Total intelligence: " + intelligence + "\n");
        heroDisplay.append("Total damage: " + damage + "\n");
        return heroDisplay.toString();
    }
}
