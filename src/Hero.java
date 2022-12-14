import java.util.*;
import Enums.ArmorType;
import Enums.Slot;
import Enums.WeaponType;
import Exceptions.InvalidArmorException;
import Exceptions.InvalidWeaponException;

public abstract class Hero {
    private String name;
    private int level;
    private final HeroAttribute levelAttributes;
    private int damage;
    private final HashMap<Slot, Item> equipment = new HashMap<Slot, Item>();
    private final HashSet<WeaponType> validWeaponTypes = new HashSet<>();
    private final HashSet<ArmorType> validArmorTypes = new HashSet<>();

    // Hero constructor
    public Hero(String name, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.level = 1;
        levelAttributes = new HeroAttribute(strength, dexterity, intelligence);
        // Initialize equipment to null on new hero
        for (Slot slot : Slot.values()) {
            equipment.put(slot, null);
        }
    }
    // Getter and setter methods for the name property
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // levelUp method
    public void levelUp() {
        level++;
    }
    public int getLevel() {
        return level;
    }
    // levelUp method
    public void getEquipment () {
        equipment.forEach(((slot, item) -> System.out.println("Slot " + slot + " Item" + item)));
    }
    // equipWeapon method
    public void equipWeapon(Weapon weapon) throws InvalidWeaponException {
        if (level >= weapon.getRequiredLevel()) {

        } else
            throw new InvalidWeaponException( level, weapon.getRequiredLevel());
    }
    // equipArmor method
    public void equipArmor(Armor armor) throws InvalidArmorException {
        if (level >= armor.getRequiredLevel()) {

        } else
            throw new InvalidArmorException(level, armor.getRequiredLevel());

    }
    // damage method
    public void damage() {
        damage = weapon.getWeaponDamage() * (1 + HeroAttribute / 100);
    }
    // totalAttributes method
    public HeroAttribute totalAttributes() {
    }

    public HashSet<WeaponType> getValidWeaponTypes() { return validWeaponTypes;}
    public HashSet<ArmorType> getValidArmorTypes() { return validArmorTypes;}

    // display method
    public void display(Hero hero) {
        StringBuilder heroDisplay = new StringBuilder();
        heroDisplay.append("Name: " + hero.getName() + "\n");
        heroDisplay.append("Class: " + hero.getClass() + "\n");
        heroDisplay.append("Level: " + hero.getLevel() + "\n");
        heroDisplay.append("Current equipment: " + hero.getEquipment());
        System.out.println(heroDisplay.toString());
    }
}
