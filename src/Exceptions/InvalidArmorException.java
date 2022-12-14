package Exceptions;

import Enums.ArmorType;

public class InvalidArmorException extends Exception {
    public InvalidArmorException(int level, int requiredLevel) {
        super("You are level " + level + " and don't  meet the level requirement of: " + requiredLevel + "and/or the type requirement of: " +  + ".");
    }
}
