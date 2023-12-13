| CS-665    | Software Design & Patterns        |
|-----------|-----------------------------------|
| Name      | Bhargav Gundapaneni               |
| Date      | 12/12/2023                        |
| Course    | Fall                              |
| Project # | Inventory Management System (IMS) |


# Application Description
The Inventory Management System (IMS) is a comprehensive solution designed for managing inventory and processing orders. This system is the culmination of the final project for the CS-665 Software Design & Patterns course at Boston University Metropolitan College. It embodies the application of advanced software design patterns and principles to address real-world challenges in inventory management.
# Implementation Description

## Design Principles
The implementation of the IMS adheres to several key software design principles, ensuring a robust, maintainable, and scalable system:

- **Flexibility**: The system is structured to easily accommodate changes or extensions. For instance, new types of inventory items or additional functionalities can be integrated with minimal modifications to the existing codebase.

- **Simplicity and Clarity**: Despite the underlying complexity, the system is implemented with simplicity in mind. Clear and understandable code enhances the maintainability and readability of the system, making it accessible to developers and maintainers.

- **Avoidance of Redundant Code**: Through the strategic use of design patterns and thoughtful code structure, the system minimizes redundant code, which is crucial for reducing errors and simplifying maintenance.

## Design Patterns
Several design patterns are utilized in this project, enhancing its functionality and structure:

- **Builder Pattern**: Applied in the construction of orders (`ADCOrderBuilder`), allowing for a step-by-step approach in creating complex order objects. This pattern enhances the flexibility and clarity of order creation.
# Design Patterns in IMS
Singleton Pattern: Implemented in the Inventory class to ensure only one instance of the inventory is created and accessed throughout the application. This pattern is crucial for maintaining consistent and synchronized access to the inventory data.

Builder Pattern: Used in the ADCOrderBuilder class. This pattern simplifies the construction of complex Order objects. It allows for a step-by-step approach to building an order, making the code more maintainable and scalable.
# Key Functionalities
Inventory Management: Add, remove, and update items in the inventory.

Order Processing: Create orders by adding items and finalize them.

Display Inventory: View all items currently in the inventory.
Design Principles and Patterns Used
Design Principles

Flexibility: The system is adaptable to changes, allowing easy integration of new features or modifications.
Simplicity and Clarity: The code is written to be easily understandable and maintainable, with a clear structure that follows industry best practices.

DRY Principle: Redundancy is minimized to enhance code maintainability and efficiency.

# Design Patterns
Builder Pattern (ADCOrderBuilder): Used for constructing complex orders. It provides a clear process for creating orders and allows the addition of new item types without altering the construction process.

# How It Works
Running the Application
Compilation: The project can be compiled using Maven. This ensures all dependencies are correctly resolved and the application is ready to run.
Execution: Once compiled, the application is run from the command line. It provides a menu-driven interface for users to interact with.
User Interaction: Users can add items to the inventory, create orders, and view the inventory through simple command-line prompts.
Implementation and Output
The IMS is implemented in Java, utilizing OOP concepts and design patterns.
Output is displayed in the console, where users can see the results of their actions (e.g., items added to the inventory, order details).
Test Cases
Unit tests are written using JUnit to ensure the reliability of key functionalities like adding/removing items and order processing. These tests can be executed through Maven to validate different parts of the application.

Output Description for Inventory Management System (IMS)
The Inventory Management System (IMS) provides a command-line interface for interacting with the inventory and processing orders. Below is a detailed explanation of the system's output and the interactions a user can expect:


# UML Diagram

UML class diagram for the Inventory Management System (IMS). This diagram visually represents the structure of the system and the relationships between its main components:

Inventory: This class manages a collection of Item objects and interacts with OrderProcessor.

Item: Represents individual items in the inventory.

Order: Consists of a list of Item objects and is created by ADCOrderBuilder.

ADCOrderBuilder: Implements the Builder pattern to construct Order objects. It contains methods to add items and build orders.

OrderProcessor: Processes orders by interacting with both Inventory and ADCOrderBuilder. It is responsible for adding products to orders and managing inventory.

UserInterface: Provides a user interface for interacting with the OrderProcessor and, through it, with the Inventory.

UserInterface to OrderProcessor: The UserInterface class uses the OrderProcessor class to process orders. This is a unidirectional association.

OrderProcessor to Inventory: The OrderProcessor class uses methods from the Inventory class to manage inventory items. This is also a unidirectional association.

OrderProcessor to ADCOrderBuilder: The OrderProcessor class uses the ADCOrderBuilder to build orders. This is an association indicating usage.

ADCOrderBuilder to Order: The ADCOrderBuilder class creates instances of the Order class. This is a unidirectional association with an arrow pointing from ADCOrderBuilder to Order, showing creation.

# OPPS Concepts used

Inventory to Item: The Inventory class contains and manages Item objects. This is a composition relationship, as Item objects exist within Inventory.

Encapsulation: Encapsulating the data and behavior within classes like Item, Order, and Inventory.

Inheritance: Not explicitly used, but it can be applied in extending functionalities.

Polymorphism: Through interfaces like OrderBuilder, allowing different implementations.

Abstraction: Abstracting complex functionalities into simpler public methods in classes.

Association: Creating relationships between classes, such as between OrderProcessor and Inventory.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line:

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

# Conclusion

The output of the IMS is designed to be clear and user-friendly, providing immediate feedback on user actions and system status. This approach ensures an intuitive and efficient user experience while interacting with the system through the command line.
This command runs all the predefined test cases, and results are displayed in the console.
The IMS project demonstrates the practical application of software design patterns and principles. It offers an efficient and user-friendly system for inventory and order management, suitable for educational and potentially small business environments.
#