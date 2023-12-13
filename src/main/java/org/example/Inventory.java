package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 20, 2023
 * File Name: Inventory.java
 * Description: Manages the inventory of items in the IMS with file-based persistence.
 */

/**
 * Manages the inventory of items in the IMS with file-based persistence.
 * Utilizes a file to store and retrieve inventory data.
 */
public class Inventory {
    private Map<String, Item> items;
    private static final String INVENTORY_FILE = "inventory.dat";

    // Constructor: Loads inventory from a file or initializes a new one.
    public Inventory() {
        items = new HashMap<>();
        loadInventory();
    }

    // Adds an item to the inventory and saves the updated inventory.
    public void addItem(String itemId, String description) {
        items.put(itemId, new Item(itemId, description));
        saveInventory();
    }

    // Removes an item from the inventory and saves the updated inventory.
    public void removeItem(String itemId) {
        items.remove(itemId);
        saveInventory();
    }

    // Updates an existing item in the inventory and saves changes.
    public void updateItem(String itemId, Item updatedItem) {
        if (items.containsKey(itemId)) {
            items.put(itemId, updatedItem);
            saveInventory();
        }
    }

    // Retrieves an item from the inventory by its ID.
    public Item getItem(String itemId) {
        return items.get(itemId);
    }

    // Saves the current state of inventory to a file.
    private void saveInventory() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(INVENTORY_FILE))) {
            oos.writeObject(items);
        } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    // Loads the inventory from a file, or starts with an empty inventory.
    private void loadInventory() {
        File file = new File(INVENTORY_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                items = (Map<String, Item>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading inventory: " + e.getMessage());
                items = new HashMap<>();
            }
        } else {
            System.out.println("Starting with an empty inventory.");
            items = new HashMap<>();
        }
    }

    // Displays all items currently in the inventory.
    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("The inventory is currently empty.");
        } else {
            System.out.println("Inventory Items:");
            for (Map.Entry<String, Item> entry : items.entrySet()) {
                System.out.println("Item ID: " + entry.getKey() + ", Description: " + entry.getValue().getDescription());
            }
        }
    }
}
