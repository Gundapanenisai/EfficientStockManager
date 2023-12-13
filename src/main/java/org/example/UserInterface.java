package org.example;

import java.util.Scanner;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: November 25, 2023
 * File Name: UserInterface.java
 * Description: Manages user interactions for the IMS.
 */
public class UserInterface {
    private final OrderProcessor orderProcessor;
    private final Inventory inventory;

    // Constructor: Initializes UserInterface with OrderProcessor and Inventory instances.
    public UserInterface(OrderProcessor orderProcessor, Inventory inventory) {
        this.orderProcessor = orderProcessor;
        this.inventory = inventory;
    }

    // Start method: Initiates the user interaction loop in the console.
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the main menu options
            System.out.println("\nOptions:");
            // Options for adding items, finalizing orders, and managing inventory
            System.out.println("1 - Add Item to Order");
            System.out.println("2 - Finalize Order and Save");
            System.out.println("3 - Remove Item from Inventory");
            System.out.println("4 - Update Item in Inventory");
            System.out.println("5 - Display All Inventory Items");
            System.out.println("6 - Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer after receiving input

            // Switch case to handle different user options
            switch (choice) {
                case 1:
                    handleAddItem(scanner);
                    break;
                case 2:
                    handleFinalizeOrder();
                    break;
                case 3:
                    handleRemoveItem(scanner);
                    break;
                case 4:
                    handleUpdateItem(scanner);
                    break;
                case 5:
                    inventory.displayAllItems();
                    break;
                case 6:
                    System.out.println("Exiting IMS...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    // handleAddItem: Adds an item to the current order
    private void handleAddItem(Scanner scanner) {
        System.out.print("Enter Item ID: ");
        String itemId = scanner.nextLine();
        System.out.print("Enter Item Description: ");
        String description = scanner.nextLine();
        orderProcessor.addProductToOrder(itemId, description);
    }

    // handleFinalizeOrder: Finalizes and displays the current order
    private void handleFinalizeOrder() {
        Order order = orderProcessor.finalizeOrder();
        if (order != null) {
            System.out.println("Finalized Order:");
            order.displayOrder();
        } else {
            System.out.println("No items in order to finalize.");
        }
    }

    // handleRemoveItem: Removes an item from the inventory
    private void handleRemoveItem(Scanner scanner) {
        System.out.print("Enter Item ID to remove: ");
        String itemId = scanner.nextLine();
        orderProcessor.removeProductFromInventory(itemId);
    }

    // handleUpdateItem: Updates an item's description in the inventory
    private void handleUpdateItem(Scanner scanner) {
        System.out.print("Enter Item ID to update: ");
        String itemId = scanner.nextLine();
        System.out.print("Enter new description: ");
        String newDescription = scanner.nextLine();
        orderProcessor.updateProductInInventory(itemId, newDescription);
    }
}
