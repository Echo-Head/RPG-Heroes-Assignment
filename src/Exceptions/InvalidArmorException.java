package Exceptions;

public class InvalidArmorException extends Exception {
    public InvalidArmorException(String hero, String armor, int level, int requiredLevel) {
        super("Your level " + level  + hero + " cannot equip a level " + requiredLevel + armor + "!");
    }
}
