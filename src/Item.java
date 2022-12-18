import Enums.Slot;

public abstract class Item {
    private final String itemName;
    private final int requiredLevel;
    private final Slot slot;

    public Item(String itemName, int requiredLevel, Slot slot) {
        this.itemName = itemName;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

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
