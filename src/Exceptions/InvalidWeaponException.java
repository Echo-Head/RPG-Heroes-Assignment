package Exceptions;

import Enums.WeaponType;


public class InvalidWeaponException extends Exception {
    public InvalidWeaponException(int level, int requiredLevel) {
        super("You don't  meet the level requirement of: " + requiredLevel + "and/or the type requirement of: " +  + ".");

    }
}