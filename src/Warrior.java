
public class Warrior extends Hero {
    public Warrior(String name, int level, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
        new HeroAttribute(5, 2, 1);
        this.validWeaponTypes.add("Axe");
        this.validWeaponTypes.add("Hammer");
        this.validWeaponTypes.add("Sword");
        this.validArmorTypes.add("Mail");
        this.validArmorTypes.add("Plate");
    }
}

