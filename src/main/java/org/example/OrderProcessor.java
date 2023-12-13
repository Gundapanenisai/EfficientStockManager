package org.example;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 22, 2023
 * File Name: OrderProcessor.java
 * Description: Processes orders in the IMS, interacting with Inventory and OrderBuilder.
 */

/**
 * Processes orders in the IMS, interacting with Inventory and OrderBuilder.
 * Handles adding products to orders, updating and removing products from inventory.
 */
public class OrderProcessor {
    private Inventory inventory;
    private ADCOrderBuilder orderBuilder;

    // Constructor initializes with an Inventory instance and a new ADCOrderBuilder.
    public OrderProcessor(Inventory inventory) {
        this.inventory = inventory;
        this.orderBuilder = new ADCOrderBuilder();
    }

    // Adds a product to the order, also adds to inventory if not present.
    public void addProductToOrder(String itemId, String description) {
        Item item = inventory.getItem(itemId);
        if (item == null) {
            item = new Item(itemId, description);
            inventory.addItem(itemId, description);
        }
        orderBuilder.addItem(item.getItemId(), item.getDescription());
        System.out.println("Item added to order: " + item);
    }

    // Removes a product from inventory.
    public void removeProductFromInventory(String itemId) {
        inventory.removeItem(itemId);
        System.out.println("Item removed from inventory: " + itemId);
    }

    // Updates a product's description in inventory.
    public void updateProductInInventory(String itemId, String newDescription) {
        Item item = inventory.getItem(itemId);
        if (item != null) {
            item.setDescription(newDescription);
            inventory.updateItem(itemId, item);
            System.out.println("Item updated in inventory: " + itemId);
        } else {
            System.out.println("Item not found in inventory: " + itemId);
        }
    }

    // Finalizes the order if it has items.
    public Order finalizeOrder() {
        return orderBuilder.hasItems() ? orderBuilder.build() : null;
    }
}
