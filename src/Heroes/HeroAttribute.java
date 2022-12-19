package Heroes;

public class HeroAttribute {
    // Variables
    private int strength;
    private int dexterity;
    private int intelligence;
    // Constructor
    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    // Method
    public void addAttribute(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }

    // Getters
    public int getStrength() { return strength; }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
