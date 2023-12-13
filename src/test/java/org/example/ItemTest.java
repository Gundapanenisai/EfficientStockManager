package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 20, 2023
 * File Name: Inventory.java
 */
/**
/**
 * Test cases for Item class.
 * Validates the functionality of setting and getting item properties.
 */
public class ItemTest {

    // Tests the setDescription method to update an item's description
    @Test
    void setDescription_ShouldUpdateDescription() {
        Item item = new Item("A001", "Test Item A");
        item.setDescription("Updated Test Item A");
        assertEquals("Updated Test Item A", item.getDescription(), "Description should be updated.");
    }
}
