# Java OOP Lab: Camp Bunk & Camper Management

## Overview
This project demonstrates fundamental Java Object-Oriented Programming (OOP) concepts, focusing on class design, encapsulation, and the "has-a" relationship between classes. It includes classes to represent bunk beds in a camp (`Bunk` class) and campers (`Camper` class), as well as a driver program to test functionality (`Lab3TestDriver`).

## Project Structure
The project consists of three main classes:
1. **Bunk**: Represents a bed assigned to campers. Each bunk has:
   - **cabin name**: The building where the bunk is located (e.g., "Blue Jay Cabin").
   - **bed number**: The unique bed number in the cabin.
   - **cost per week**: The weekly fee for staying in the bunk.

2. **Camper**: Represents a camper enrolled at the camp. Each camper has:
   - **name**: The camper’s full name.
   - **camp fees**: Weekly program fees.
   - **excursion fees**: Weekly fees for additional activities.
   - **funding support**: Charitable donations to offset camp costs.
   - **bunk**: The assigned `Bunk` object, representing the camper's bed.

3. **Lab3TestDriver**: A test driver to create sample campers and print relevant details, including:
   - Each camper’s total weekly fees, considering camp, excursion, bunk costs, and funding.
   - A mail label showing the camper’s name and bunk location.

## Key Features
- **Encapsulation and Data Management**: Uses constructors, accessors, and mutators to manage instance variables.
- **Javadoc Documentation**: Comprehensive documentation is provided for each class and method using Javadoc comments.
- **Class Relationship**: Demonstrates the "has-a" relationship, with `Camper` objects containing `Bunk` objects.

## Usage
To run the project:
1. Compile `Bunk.java`, `Camper.java`, and `Lab3TestDriver.java`.
2. Run the `Lab3TestDriver` class to see the output, which includes formatted details about each camper and their total weekly costs.

### Sample Output
The output shows:
- The camper's name, cabin, and bed number (formatted as a mail label).
- The total weekly fees for each camper.

## Documentation
Javadoc comments are provided for all classes and methods. You can generate HTML documentation by running:
```bash
javadoc -author -private Bunk.java Camper.java
