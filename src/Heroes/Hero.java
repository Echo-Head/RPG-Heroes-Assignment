package Heroes;

import java.util.*;
import Enums.ArmorType;
import Enums.Slot;
import Enums.WeaponType;
import Exceptions.InvalidArmorException;
import Exceptions.InvalidWeaponException;
import Items.Armor;
import Items.Item;
import Items.Weapon;

public abstract class Hero {

    // Variables
    private String name;
    private int level;
    private final HeroAttribute levelAttributes;
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
    // Getters
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
   public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }
    public HashSet<WeaponType> getValidWeaponTypes() { return validWeaponTypes;}
    public HashSet<ArmorType> getValidArmorTypes() { return validArmorTypes;}
    public HeroAttribute getTotalAttributes() {
        HeroAttribute totalAttribute = new HeroAttribute(levelAttributes.getStrength(), levelAttributes.getDexterity(), levelAttributes.getIntelligence());
        for (Map.Entry<Slot, Item> entry : equipment.entrySet()) {
            Slot slot = entry.getKey();
            Item item = entry.getValue();
            if (slot != Slot.WEAPON && slot != null && item != null) {
                Armor armor = (Armor) item;
                HeroAttribute attribute = armor.getArmorAttribute();
                totalAttribute.addAttribute(attribute.getStrength(), attribute.getDexterity(), attribute.getIntelligence());
            }
        }
        return totalAttribute;
    }

    // Public methods
    public void levelUp(int strength, int dexterity, int intelligence) {
        level++;
        levelAttributes.addAttribute(strength, dexterity, intelligence);
    }

    public void equipWeapon(Weapon weapon) throws InvalidWeaponException {
        if (level >= weapon.getRequiredLevel()) {
            if (!validWeaponTypes.contains(weapon.getWeaponType())) {
            throw new InvalidWeaponException(getClass().getSimpleName(), weapon.getWeaponType().name(), level, weapon.getRequiredLevel());
            }
        } else {
            equipment.put(Slot.WEAPON, weapon);
        }
    }
    public void equipArmor(Armor armor) throws InvalidArmorException {
        if (level >= armor.getRequiredLevel()) {
            if (!validArmorTypes.contains(armor.getArmorType())) {
            throw new InvalidArmorException(getClass().getSimpleName(), armor.getArmorType().name(), level, armor.getRequiredLevel());
            }
        } else {
            equipment.put(armor.getSlot(), armor);
        }
    }
    public int damage() {

    }


    public void display(Hero hero) {
        StringBuilder heroDisplay = new StringBuilder();
        heroDisplay.append("Name: " + hero.getName() + "\n");
        heroDisplay.append("Class: " + hero.getClass() + "\n");
        heroDisplay.append("Level: " + hero.getLevel() + "\n");
        heroDisplay.append("Current Equipment: " + hero.getEquipment() + "\n");
        heroDisplay.append("Total Strength: " + hero.getTotalAttributes().getStrength() + "\n");
        heroDisplay.append("Total Dexterity: " + hero.getTotalAttributes().getDexterity() + "\n");
        heroDisplay.append("Total Intelligence: " + hero.getTotalAttributes().getIntelligence() + "\n");
        heroDisplay.append("Damage: " + hero.damage());
        System.out.println(heroDisplay.toString());
    }
}
