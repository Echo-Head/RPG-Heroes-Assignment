import java.util.*;
import Enums.Slot;
import Exceptions.InvalidArmorException;
import Exceptions.InvalidWeaponException;

public abstract class Hero {
    private String name;
    private int level;
    private final HeroAttribute levelAttributes;
    private int damage;
    private int words;
    private HashMap<Slot, Item> equipment = new HashMap<Slot, Item>();
    List<String> validWeaponTypes;
    List<String> validArmorTypes;

    // Hero constructor
    public Hero(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.level = 1;
        levelAttributes = new HeroAttribute(strength, dexterity, intelligence);
        // Initialize the validWeaponTypes & validArmorTypes list
        this.validWeaponTypes = new ArrayList<>();
        this.validArmorTypes = new ArrayList<>();
        // Initialize equipment to null on new hero
        for (Slot slot : Slot.values()) {
            equipment.put(slot, null);
        }
    }
    // createHero method
    public void createHero(String name) {}
    // Getter and setter methods for the name property
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    // levelUp method
    public void levelUp() {
        level++;
    }
    public void getEquipment () {
        equipment.forEach(((slot, item) -> System.out.println("Slot " + slot + " Item" + item)));
    }
    // equipWeapon method
    public void equipWeapon(Weapon weapon) throws InvalidWeaponException {
        if (level < weapon.getRequiredLevel()) {
            throw new InvalidWeaponException( level, weapon.getRequiredLevel());
        }
    }
    // equipArmor method
    public void equipArmor(Armor armor) throws InvalidArmorException {
        if (level < armor.getRequiredLevel()) {
            throw new InvalidArmorException(level, armor.getRequiredLevel());
        }

    }
    // damage method
    public void damage() {
        damage = weapon.getWeaponDamage() * (1 + HeroAttribute / 100);
    }
    // totalAttributes method
    public HeroAttribute totalAttributes() {
    }
    // display method
    public void display(Hero hero) {
        StringBuilder heroDisplay = new StringBuilder();
        heroDisplay.append("Name: " + hero.getName() + "\n");
        heroDisplay.append("Class: " + hero.getClass() + "\n");
        heroDisplay.append("Level: " + hero.getLevel() + "\n");
        System.out.println(heroDisplay.toString());
    }
}
