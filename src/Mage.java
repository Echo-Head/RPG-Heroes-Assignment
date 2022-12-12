import Enums.Slot;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void createHero(String name) {
        equipment.put(Slot.WEAPON, null);
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        this.validWeaponTypes.add("Staff");
        this.validWeaponTypes.add("Wand");
        this.validArmorTypes.add("Cloth");
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void mageStartDex(int mageStartDex) {
        this.mageStartDex = mageStartDex;
    }
    public void mageStartInt(int mageStartInt) {
        this.mageStartInt = mageStartInt;
    }


    public int getLevel() {
        return ;
    }
    Mage mage = new Mage("Gandalf");
    mage.createHero();
}
