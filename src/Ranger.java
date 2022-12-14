
public class Ranger extends Hero {
    public Ranger(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
        new HeroAttribute(1, 7, 1);
        this.validWeaponTypes.add("Bow");
        this.validArmorTypes.add("Leather");
        this.validArmorTypes.add("Mail");
    }
}
