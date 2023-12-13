package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 20, 2023
 * File Name: Inventory.java
 */
/**
 * Test cases for OrderProcessor class to validate order processing and inventory interaction.
 */
public class OrderProcessorTest {
    private Inventory inventory;
    private OrderProcessor orderProcessor;

    // Setup for tests, initializing inventory and order processor
    @BeforeEach
    void setUp() {
        inventory = new Inventory();
        orderProcessor = new OrderProcessor(inventory);
    }

    // Test adding a new item to order and inventory
    @Test
    void addProductToOrder_WithNewItem_ShouldAddToInventoryAndOrder() {
        orderProcessor.addProductToOrder("B002", "Test Item B");
        assertNotNull(inventory.getItem("B002"), "New item should be added to inventory.");
        Order order = orderProcessor.finalizeOrder();
        assertFalse(order.getItems().isEmpty(), "Order should have items after adding new item.");
    }

    // Test removing an item from the inventory
    @Test
    void removeProductFromInventory_ShouldRemoveItem() {
        inventory.addItem("C003", "Test Item C");
        orderProcessor.removeProductFromInventory("C003");
        assertNull(inventory.getItem("C003"), "Item should be removed from inventory.");
    }

    // Test updating a product's description in inventory
    @Test
    void updateProductInInventory_ShouldUpdateItemDescription() {
        inventory.addItem("D004", "Old Description");
        orderProcessor.updateProductInInventory("D004", "New Description");
        assertEquals("New Description", inventory.getItem("D004").getDescription(), "Item description should be updated.");
    }

    // Test finalizing an order with no items
    @Test
    void finalizeOrder_WithNoItems_ShouldReturnNull() {
        Order order = orderProcessor.finalizeOrder();
        assertNull(order, "Finalize order should return null when there are no items.");
    }
}
