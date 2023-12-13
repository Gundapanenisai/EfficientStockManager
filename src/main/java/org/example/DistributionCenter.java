package org.example;

/**
 * Author: Bhargav Gundapaneni
 * Course: CS-665 Software Design & Patterns
 * Date: ...
 * File Name: DistributionCenter.java
 * Description: Main class integrating all components of the IMS, initiating the user interface.
 */
public class DistributionCenter {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // Create Inventory object
        OrderProcessor orderProcessor = new OrderProcessor(inventory);

        // Pass both inventory and orderProcessor to the UserInterface
        UserInterface ui = new UserInterface(orderProcessor, inventory);
        ui.start();
    }
}
