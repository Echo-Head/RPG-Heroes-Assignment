package Exceptions;

public class InvalidWeaponException extends Exception {
    public InvalidWeaponException(String hero, String weapon, int level, int requiredLevel) {
        super("Your level " + level + hero + " cannot equip a level " + requiredLevel + weapon + "!");
    }
}
