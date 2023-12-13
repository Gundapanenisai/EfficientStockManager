package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 20, 2023
 * File Name: Inventory.java
 * Description: Test cases for Inventory class.
 */
/**

/**
 * Test cases for Inventory class.
 * Validates functionality for adding, removing, and updating items.
 */
public class InventoryTest {
    private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
    }

    // Tests adding an item to the inventory
    @Test
    void addItem_ShouldAddItemToInventory() {
        inventory.addItem("A001", "Test Item A");
        assertNotNull(inventory.getItem("A001"), "Item should be added to inventory.");
    }

    // Tests removing an item from the inventory
    @Test
    void removeItem_ShouldRemoveItemFromInventory() {
        inventory.addItem("A001", "Test Item A");
        inventory.removeItem("A001");
        assertNull(inventory.getItem("A001"), "Item should be removed from inventory.");
    }

    // Tests updating an item in the inventory
    @Test
    void updateItem_ShouldUpdateItemInInventory() {
        inventory.addItem("A001", "Test Item A");
        inventory.updateItem("A001", new Item("A001", "Updated Test Item A"));
        assertEquals("Updated Test Item A", inventory.getItem("A001").getDescription(), "Item description should be updated.");
    }
}
