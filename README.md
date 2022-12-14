# RPGHeroes
Noroff Java Fullstack RPGHeroes task. Java program imitating RPG game character and item functionality.

## About
The program has functionality for armors, weapons and heroes. 3 different hero classes are implemented: mage, warrior and ranger. Every hero has attributes such as strenght and dexterity, which get scaled when leveling up.

Program has implementation for 4 different type of armors currently: Cloth, Leather, Mail and Plate armors.
Armors can be assigned to either the Head, Body or Legs slot.

Currently there are also 7 different type of weapons: melee, magic and ranged weapons. Every weapon type gets boost to it's attack damage from it's wielders stats, melee weapons get boost from strength, ranged weapons from dexterity and magic weapons from intelligence.

Armor and Weapon class inherit from an abstract Item class. Hero classes (mage, ranger, warrior) inherit from an abstract Hero class. There is currently functionality for creating items, creating heroes, equpping armors and weapons to heros, leveling up and attacking.

Currently the GameInterface class of the program is creating some characters, weapons and items and demostrating the functionality by printing them out.

## Usage
To construct a new hero (replace Mage with Warrior, Ranger or Rogue):
```java
Mage mage = new Mage(String name);
```
to construct new Weapon (replace RangedWeapon with MeleeWeapon / MagicWeapon)
```java
RangedWeapon rangedWeapon = new RangedWeapon(String name, int level);
```
To construct a new Armor piece (replace PlateArmor with ClothArmor / LeatherArmor and Slot.LEGS with Slot.BODY/HEAD)
```java
ClothArmor clothLeggings = new ClothArmor(String name, int level, EquipmentSlot.LEGSLOT);
```





