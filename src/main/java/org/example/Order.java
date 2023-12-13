package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: ...
 * File Name: Order.java
 * Description: Represents a customer order in the IMS.
 */

/**
 * Represents a customer order in the IMS.
 * Manages a list of items that make up the order.
 */
public class Order {
    private List<Item> items;

    // Constructor initializes an empty list of items.
    public Order() {
        this.items = new ArrayList<>();
    }

    // Adds an item to the order.
    public void addItem(Item item) {
        items.add(item);
    }

    // Returns the list of items in the order.
    public List<Item> getItems() {
        return items;
    }

    // Displays the contents of the order.
    public void displayOrder() {
        if (items.isEmpty()) {
            System.out.println("No items in the order.");
        } else {
            System.out.println("Order Contents:");
            items.forEach(System.out::println);
        }
    }
}
