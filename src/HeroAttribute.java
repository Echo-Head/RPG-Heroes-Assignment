public class HeroAttribute {

    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public HeroAttribute add(HeroAttribute other) {
        int strength = this.strength + other.strength;
        int dexterity = this.dexterity + other.dexterity;
        int intelligence = this.intelligence + other.intelligence;
        return new HeroAttribute(strength, dexterity, intelligence);
    }
}
