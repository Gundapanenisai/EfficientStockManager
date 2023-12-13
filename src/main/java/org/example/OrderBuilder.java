package org.example;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 15, 2023
 * File Name: OrderBuilder.java
 * Description: Interface for building orders in the IMS.
 */
public interface OrderBuilder {
    OrderBuilder addItem(String itemId, String description);
    Order build();
}
