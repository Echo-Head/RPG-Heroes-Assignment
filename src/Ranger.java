import Enums.Slot;

public class Ranger extends Hero {
    public Ranger(String name) {
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
        this.validWeaponTypes.add("Bow");
        this.validArmorTypes.add("Leather");
        this.validArmorTypes.add("Mail");
    }

    Ranger ranger = new Ranger("Legolas");
    ranger.createHero();
}
