package org.example;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: ...
 * File Name: ADCOrderBuilder.java
 * Description: Implements OrderBuilder for constructing orders in the IMS.
 */

/**
 * Implements OrderBuilder for constructing orders in the IMS.
 * Utilizes the Builder pattern for flexible and incremental order construction.
 */
public class ADCOrderBuilder implements OrderBuilder {
    private Order order;

    // Constructor: Initializes a new order.
    public ADCOrderBuilder() {
        this.order = new Order();
    }

    // Adds an item to the order. Chaining method for fluent API.
    @Override
    public OrderBuilder addItem(String itemId, String description) {
        Item item = new Item(itemId, description);
        order.addItem(item);
        return this;
    }

    // Builds and returns the final order.
    @Override
    public Order build() {
        return order;
    }

    // Checks if the current order has items.
    public boolean hasItems() {
        return !order.getItems().isEmpty();
    }
}
