package Items;

import Enums.Slot;

public abstract class Item {
    // Fields
    private final String itemName;
    private final int requiredLevel;
    private final Slot slot;

    // Item constructor
    public Item(String itemName, int requiredLevel, Slot slot) {
        this.itemName = itemName;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }
    public int getRequiredLevel() {
        return requiredLevel;
    }
    public Slot getSlot() {
        return slot;
    }
}
