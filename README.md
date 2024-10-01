# coding-project
Design Patterns Exercise 1

This repository contains implementations of different software design patterns. It demonstrates the use of various Behavioral, Creational, and Structural design patterns, each with a unique use case to showcase understanding and practical application.
Repository Structure

Design_Patterns_Exercise_1
│
├── Behavioural
│   ├── Environmental_Monitoring_System
│   └── HomeAutomation_CommandPattern
│
├── Creational/
│   ├── ShapeFactory_System
│   └── Logger_SingletonPattern
│
├── Structural/
│   ├── VoltageAdapter_System
│   └── CoffeeShop_DecoratorPattern

1. Behavioural Design Patterns
A. Environmental Monitoring System (Observer Pattern)

    Pattern: Observer

    Use Case: A monitoring system that continuously tracks environmental parameters like temperature using different sensors. Mobile devices act as observers and receive updates when there is a change in the environment.

    Files:
        MobileDisplay.java
        MonitoringSystem.java
        Observer.java
        Sensor.java
        TemperatureSensor.java

B. Home Automation (Command Pattern)
    Pattern: Command


Use Case: A home automation system where a remote control can send commands (like turning lights on/off) to devices. Commands are encapsulated into objects to allow flexibility in actions.

Files:
        Command.java
        Light.java
        RemoteControl.java
        TurnOnLightCommand.java
        TurnOffLightCommand.java

2. Creational Design Patterns
A. Shape Factory (Factory Pattern)

    Pattern: Factory

    Use Case: A shape-drawing system that generates different shapes (like Circle, Rectangle) using a factory. This allows for decoupling of the shape instantiation logic from client code.

    Files:
        Shape.java
        Circle.java
        Rectangle.java
        ShapeFactory.java
        FactoryPatternDemo.java

B. Logger (Singleton Pattern)

 Pattern: Singleton

Use Case: A logging system that ensures only a single instance of the logger class exists throughout the application, providing global access to it.

Files:
        Logger.java
        SingletonPatternDemo.java

3. Structural Design Patterns
A. Voltage Adapter System (Adapter Pattern)

    Pattern: Adapter

    Use Case: A system that adapts voltage from 220V to 110V using an adapter. This demonstrates how the adapter pattern helps in making incompatible interfaces work together.

    Files:
        Voltage110V.java
        Voltage220V.java
        VoltageAdapter.java
        AdapterPatternDemo.java

B. Coffee Shop System (Decorator Pattern)

Pattern: Decorator

Use Case: A coffee shop system where you can customize your coffee with different ingredients (like milk, sugar) dynamically by decorating the base coffee object.

Files:
        Coffee.java
        BasicCoffee.java
        CoffeeDecorator.java
        MilkDecorator.java
        SugarDecorator.java
        DecoratorPatternDemo.java

How to Run the Code

    Clone the repository:

    bash

git clone https://github.com/<YourUsername>/Design_Patterns_Exercise_1.git

Navigate to any pattern's directory (e.g., Behavioural/Environmental_Monitoring_System):

    bash

    cd Design_Patterns_Exercise_1/Behavioural/Environmental_Monitoring_System

Compile and run the Java files using:

    bash

    javac *.java
    java <MainClassName>

Repeat for other design patterns to see their implementations in action.

About

This project demonstrates various software design patterns, following the requirements of Exercise 1: Design Patterns. It includes:

Two use cases for Behavioral Design Patterns.
Two use cases for Creational Design Patterns.
Two use cases for Structural Design Patterns.



Mini-projects Exercise 2
    # Astronaut Daily Schedule Organizer

## Overview
The Astronaut Daily Schedule Organizer is a console-based application designed to help astronauts organize their daily tasks efficiently. The application allows users to add, remove, and view daily tasks, each with a description, start time, end time, and priority level. This project demonstrates the implementation of a basic CRUD (Create, Read, Update, Delete) application, adhering to best coding practices, design patterns, and SOLID principles.

## Features
### Mandatory Requirements
- **Add Task**: Users can add a new task with a description, start time, end time, and priority level.
- **Remove Task**: Users can remove an existing task from the schedule.
- **View Tasks**: Users can view all tasks sorted by start time.
- **Task Overlap Validation**: New tasks are validated to ensure they do not overlap with existing tasks.
- **Error Handling**: Appropriate error messages are provided for invalid operations.

### Optional Requirements
- **Edit Task**: Users can edit details of an existing task.
- **Mark Tasks as Completed**: Users can mark tasks as completed.
- **View by Priority Level**: Users can filter and view tasks based on their priority level.

## Design Patterns Used
- **Singleton Pattern**: Ensures only one instance of the Schedule Manager exists.
- **Factory Pattern**: A factory is used to create Task objects.
- **Observer Pattern**: Users are notified of task conflicts or updates.

## Installation
To run the application, clone this repository and navigate to the project directory:

    bash
    git clone https://github.com/yourusername/astronaut-schedule-organizer.git
    cd astronaut-schedule-organizer

Usage

Run the application using your preferred Java IDE or via the command line:

    bash

    java Main

Follow the on-screen prompts to add, remove, and view tasks.

Error Handling

The application gracefully handles errors such as:

Invalid time formats
Task conflicts
Attempting to remove a non-existent task

Code Quality

The code adheres to best practices including:

Object-Oriented Programming principles
SOLID design principles
Clean and maintainable code structure
