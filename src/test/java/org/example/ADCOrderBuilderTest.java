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
/**
 * Test cases for ADCOrderBuilder class.
 * Ensures correct functionality of order building process.
 */
public class ADCOrderBuilderTest {
    private ADCOrderBuilder orderBuilder;

    @BeforeEach
    void setUp() {
        orderBuilder = new ADCOrderBuilder();
    }

    // Tests if items are correctly added to the order
    @Test
    void addItem_ShouldAddItemToOrder() {
        orderBuilder.addItem("A001", "Test Item A");
        Order order = orderBuilder.build();
        assertFalse(order.getItems().isEmpty(), "Order should have items after adding.");
    }

    // Tests if the build method returns a valid order
    @Test
    void build_ShouldReturnOrder() {
        orderBuilder.addItem("A001", "Test Item A");
        Order order = orderBuilder.build();
        assertNotNull(order, "Build should return a non-null order.");
    }

    // Tests if hasItems returns true when the order has items
    @Test
    void hasItems_WhenOrderHasItems_ShouldReturnTrue() {
        orderBuilder.addItem("A001", "Test Item A");
        assertTrue(orderBuilder.hasItems(), "hasItems should return true when order has items.");
    }

    // Tests if hasItems returns false when the order is empty
    @Test
    void hasItems_WhenOrderIsEmpty_ShouldReturnFalse() {
        assertFalse(orderBuilder.hasItems(), "hasItems should return false when order is empty.");
    }
}
