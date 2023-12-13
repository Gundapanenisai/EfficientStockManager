package org.example;

import java.io.Serializable;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: ...
 * File Name: Item.java
 * Description: Represents individual items in the inventory of the IMS.
 */

/**
 * Represents individual items in the inventory of the IMS.
 * Each item is identifiable by its unique ID and has a descriptive text.
 */
public class Item implements Serializable {
    private String itemId;      // Unique identifier for the item
    private String description; // Descriptive text for the item

    // Constructor to initialize item details
    public Item(String itemId, String description) {
        this.itemId = itemId;
        this.description = description;
    }

    // Returns the item ID
    public String getItemId() {
        return itemId;
    }

    // Returns the item's description
    public String getDescription() {
        return description;
    }

    // Updates the item's description
    public void setDescription(String description) {
        this.description = description;
    }

    // Provides a string representation of the item, including ID and description
    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
