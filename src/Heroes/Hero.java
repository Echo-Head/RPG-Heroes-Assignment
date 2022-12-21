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

    // Fields
    private final String name;
    private int level;
    private final HeroAttribute levelAttributes;
    private final HashMap<Slot, Item> equipment = new HashMap<>();
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
        equipment.forEach(((slot, item) -> {
            if (slot != Slot.WEAPON && slot != null && item != null) {
                Armor armor = (Armor) item;
                HeroAttribute attribute = armor.getArmorAttribute();
                totalAttribute.addAttribute(attribute.getStrength(), attribute.getDexterity(), attribute.getIntelligence());
            }
        }));
        return totalAttribute;
    }

    // Public facing methods
    public void levelUp(int strength, int dexterity, int intelligence) {
        level++;
        levelAttributes.addAttribute(strength, dexterity, intelligence);
    }

    public void equip(Weapon weapon) throws InvalidWeaponException {
        if (level >= weapon.getRequiredLevel()) {
            if (!validWeaponTypes.contains(weapon.getWeaponType())) {
            throw new InvalidWeaponException(getClass().getSimpleName(), weapon.getWeaponType().name(), level, weapon.getRequiredLevel());
            }
        } else {
            equipment.put(Slot.WEAPON, weapon);
        }
    }

    // This isn't working properly, not sure of the cause
    public void equip(Armor armor) throws InvalidArmorException {
        if (level >= armor.getRequiredLevel()) {
            if (!validArmorTypes.contains(armor.getArmorType())) {
            throw new InvalidArmorException(getClass().getSimpleName(), armor.getArmorType().name(), level, armor.getRequiredLevel());
            }
        } else {
            equipment.put(armor.getSlot(), armor);
        }
    }

    public double damage() {
        String className = getClass().getSimpleName();
        double multiplier =
                "Warrior".equals(className) ? getTotalAttributes().getStrength() :
                        "Mage".equals(className) ? getTotalAttributes().getIntelligence() :
                                ("Ranger".equals(className) || "Rogue".equals(className)) ? getTotalAttributes().getDexterity() :
                                        1;

        Weapon weapon = (Weapon) equipment.get(Slot.WEAPON);
        double baseExpression = 1.0 + multiplier / 100.0;
        return weapon == null ? baseExpression : weapon.getWeaponDamage() * baseExpression;
    }

    public void display() {
        StringBuilder heroDisplay = new StringBuilder();
        heroDisplay.append("Name: " + getName() + "\n");
        heroDisplay.append("Class: " + getClass().getSimpleName() + "\n");
        heroDisplay.append("Level: " + getLevel() + "\n");
        heroDisplay.append("Total Strength: " + getTotalAttributes().getStrength() + "\n");
        heroDisplay.append("Total Dexterity: " + getTotalAttributes().getDexterity() + "\n");
        heroDisplay.append("Total Intelligence: " + getTotalAttributes().getIntelligence() + "\n");
        heroDisplay.append("Current Equipment: " + getEquipment() + "\n");
        heroDisplay.append("Damage: " + damage());
        System.out.println(heroDisplay.toString());
    }
}
