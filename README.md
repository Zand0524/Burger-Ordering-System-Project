# Burger Ordering System

## Overview
Title: Burger Ordering System

Description:
This Java-based burger ordering system demonstrates fundamental principles of object-oriented programming (OOP) and software engineering. 
It comprises modular components like Burgers, Drinks, and Sides, showcasing skills in encapsulation, inheritance, and composition. 
The system allows users to create customized meals, including regular and deluxe burgers, with optional toppings and side items. 
Additionally, it supports the creation of deluxe burger meals where all toppings, drinks, and sides are included in the deluxe combo price.
It emphasizes code modularity, readability, and error handling, serving as a practical showcase for basic OOP concepts.

Key Features:

Modular Design: Structured with modular components for easy extension and maintenance.
Customization: Supports customization of meals with optional toppings and side items.
Polymorphism: Implements polymorphic behavior for different burger types, enhancing code flexibility.
Encapsulation: Each class encapsulates its state and behavior, promoting code reusability and maintainability.
Composition: Utilizes composition to combine burger, drink, and side items, adhering to the principle of composition over inheritance.
Exception Handling: Implements error handling mechanisms for input validation and user-friendly error messages.
Transferrable Concepts:

OOP Principles: Demonstrates understanding of classes, objects, inheritance, and polymorphism.
Modularization: Shows how to break down a problem into manageable components for better organization and maintenance.
Code Readability: Emphasizes clear and concise code with meaningful naming conventions and comments.
Problem Solving: Illustrates problem-solving skills through practical implementation of a real-world scenario.
Documentation: Provides concise documentation and comments for improved code readability and maintainability.

## Features

- Create default meals with a regular burger, small coke, and fries.
- Customize meals by specifying different burgers, drinks, and side items.
- Support for up to 3 extra toppings on regular burgers and up to 5 toppings on deluxe burgers.
- Deluxe burger meals automatically include toppings, drinks, and sides in the burger price.
- Calculate subtotal, taxes, and total price for each meal order.
- Print detailed receipts for each meal order.

## Installation

1. Clone the repository to your local machine:

```bash
git clone https://github.com/your-zand0524/burger-ordering-system.git
```
2. Navigate to the project directory.
```bash
cd burger-ordering-system
```
3. Compile the java files.
```bash
javac Main.java
```
4. Run the main class.
```bash
java Main
```
_____________________________________________________
## **Usage**
_____________________________________________________

### **Creating a Default Meal**

// Create a default meal
```bash
MealOrder defaultMeal = new MealOrder(); //Defaults to regular burger special. 
defaultMeal.printReceipt();
```

### **Creating a Custom Meal**
```bash
// Create custom burger with up to 3 toppings, drink, and side instances
// These can be added within the MealOrder method parameters.

Burgers burger = new Burgers(1); // Regular burger
Drink drink = new Drink("Coke", 'M'); // Medium coke. 
Sides side = new Sides("Fries"); // Fries.

// Create or Pass them to MealOrder constructor
MealOrder customMeal = new MealOrder(burger, drink, side);

//Add toppings 
customMeal.burger.addToppings(1, 2, 3); // Example toppings, individually priced. See index below. 

// Print receipt
customMeal.printReceipt();
```

### **Creating a Deluxe Meal Special Combo**
```bash
// Create deluxe burger, drink, and side instances.
// These can be added within the MealOrder method parameters.

DeluxeBurger deluxeBurger = new DeluxeBurger(2); // Deluxe burger
Drink drink = new Drink("Coke", 'L'); // Large coke
Sides side = new Sides("Fries"); // Fries

// Create or Pass them to MealOrder constructor
MealOrder deluxeMeal = new MealOrder(deluxeBurger, drink, side);

//Add toppings to deluxe burger as needed
deluxeMeal.deluxeBurger.addToppings(1, 2, 3, 4, 5); // Example toppings

// Print receipt
deluxeMeal.printReceipt();
```

## **Overview of Menu & Index Numbers**
______________________________________________
### **BURGERS**
1. BURGER..................6.99
2. VEGAN BURGER............6.99
3. DELUXE BURGER MEAL.....15.99

______________________________________________
### **EXTRA TOPPINGS INDEX NUMBERS**
1. CHEESE..............0.99
2. LETTUCE.............0.50
3. TOMATO..............0.99
4. ONION...............0.99
5. PICKLES.............0.99
6. BACON...............1.50
7. ONION RING..........1.99
8. KETCHUP.............0.00
9. MUSTARD.............0.00

______________________________________________
### **SIDES AVAILABLE**
FRIES...................1.99
ONION RINGS.............2.99
CHEESE STICKS...........2.99
SALAD...................1.50

## **Contributing**
Contributions are welcome! Fork the repository and submit a pull request with your changes.

## **License**
This project is licensed under the MIT License.


