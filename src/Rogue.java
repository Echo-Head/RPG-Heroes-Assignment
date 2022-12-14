
public class Rogue extends Hero {
    public Rogue(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
        new HeroAttribute(2, 6, 1);
        this.validWeaponTypes.add("Dagger");
        this.validWeaponTypes.add("Sword");
        this.validArmorTypes.add("Leather");
        this.validArmorTypes.add("Mail");
    }
}