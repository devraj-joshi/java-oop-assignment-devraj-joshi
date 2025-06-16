# Java OOP Assignment – Employee Management System

## 👨‍🎓 Student Information
- **Name:** Devraj Joshi  

---

## 🧾 Assignment Objective

The purpose of this assignment is to build a Java-based system that demonstrates core Object-Oriented Programming (OOP) concepts by managing different types of employees (Employee, Manager, Intern).

---

## 💼 How OOP Concepts Are Implemented

This project leverages multiple Object-Oriented Programming (OOP) principles to design a modular and extensible employee management system:

# Classes and Objects:
The system is built using several Java classes such as Employee, Manager, and Intern. These classes are instantiated to create specific objects representing different types of personnel.

# Class Methods and Instance Variables:
Each class defines instance methods like displayInfo() and maintains instance variables such as name, id, and salary to encapsulate and operate on individual object data.

# Inheritance:
The classes Manager and Intern extend the Employee class, which in turn inherits from the abstract base class Person. This hierarchical structure promotes code reuse and logical organization.

# Polymorphism:
Polymorphism is demonstrated through the use of a Person reference to handle objects of different subclasses. Methods like calculatePay() and displayInfo() are overridden in each subclass to provide behavior specific to that type.

# Abstract Class:
The Person class is declared abstract and serves as a template for all types of personnel. It contains shared properties and declares an abstract method displayInfo() that must be implemented by all derived classes.

# Interface:
The Payable interface defines a method calculatePay(), which is implemented in all classes to provide custom logic for computing monthly pay for employees, managers (with bonus), and interns.

# Static Method
A static method getEmployeeCount() is defined within the Person class to track the total number of employee instances created. This demonstrates the use of static members for class-level data management.

## 🗃️ File List

Main.java // Entry point of the program
Person.java // Abstract class defining common fields and behaviors
Payable.java // Interface for payment calculation
Employee.java // Base class for all employee types
Manager.java // Subclass with bonus calculation
Intern.java // Subclass for interns with stipend
README.md // Documentation file

## ▶️ Sample Output
Employee: Hari Prasad Khanal, ID: 101
Monthly Pay: Rs 3000.0

Manager: Fulkumari Ghaley, ID: 102
Monthly Pay with Bonus: Rs 5000.0

Intern: Hari maya Tamang, ID: 103
Monthly Pay: Rs 1500.0

Total Employees: 3

## 🚀 How to Run the Code
1. javac Main.java
2. java Main
