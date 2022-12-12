import Enums.Slot;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    int startLevel = 1;
    private int strength;
    private int dexterity;
    private int intelligence;

    @Override
    public void createHero(String name) {
        equipment.put(Slot.WEAPON, null);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        this.validWeaponTypes.add("Axe");
        this.validWeaponTypes.add("Hammer");
        this.validWeaponTypes.add("Sword");
        this.validArmorTypes.add("Mail");
        this.validArmorTypes.add("Plate");
    }

    Warrior warrior = new Warrior("Aragorn");
    warrior.createHero();
