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
 * Test cases for the Order class to ensure correct handling of order items.
 */
public class OrderTest {

    // Test adding an item to an order
    @Test
    void addItem_ShouldAddItemToOrder() {
        Order order = new Order();
        order.addItem(new Item("A001", "Test Item A"));
        assertFalse(order.getItems().isEmpty(), "Order should have items.");
    }

    // Test displaying order contents
    @Test
    void displayOrder_ShouldShowOrderContents() {
        Order order = new Order();
        order.addItem(new Item("A001", "Test Item A"));
        assertEquals(1, order.getItems().size(), "Order should display correct number of items.");
    }
}
