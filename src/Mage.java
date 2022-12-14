
public class Mage extends Hero {
    public Mage(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
        new HeroAttribute(1, 1, 8);
        this.validWeaponTypes.add("Staff");
        this.validWeaponTypes.add("Wand");
        this.validArmorTypes.add("Cloth");
    }
}
