# RPGHeroes
Noroff Java Fullstack RPG Heroes assignment. Java program imitating RPG game character and item functionality.

## Table of Contents

- [About](#about)
- [Usage](#usage)

## About
The program has functionality to construct armors, weapons and heroes. 4 different hero classes are implemented: Mage, Ranger, Rogue and Warrior. Every hero has attributes such as Strength, Dexterity and Intelligence, which increase when leveling up.

The program has implementation for 4 different armor types: Cloth, Leather, Mail and Plate armors.
Armors can be assigned to either the Head, Body or Legs slot.

Currently there are also 7 different weapon types: Axe, Bow, Dagger, Hammer, Staff, Sword and Wand. Every weapon has a level requirement and damage attribute.

The Armor and Weapon classes inherit from an abstract Items class. Hero classes (Mage, Ranger, Rogue, Warrior) inherit from an abstract Hero class. There is currently functionality for creating items, creating heroes, equipping armors and weapons to heroes and leveling up.

Currently the Main class of the program is creating some heroes, weapons and armor and demonstrating the functionality by calling functions and printing them out.

## Usage
To construct a new hero (replace Mage with Warrior, Ranger or Rogue):
```java
Mage myMage = new Mage("Gandalf");
```
To construct a new Weapon (replace WeaponType.WAND with AXE, BOW, SWORD, etc.):
```java
Weapon fireWand = new Weapon("Fire Wand", WeaponType.WAND, 10, 6);
```
To construct a new Armor piece (replace ArmorType.CLOTH with PLATE, LEATHER or MAIL, and replace Slot.HEAD with BODY or LEGS):
```java
Armor clothHat = new Armor("Cloth Hat", ArmorType.CLOTH, 20, Slot.HEAD, 5, 5, 10);
```





