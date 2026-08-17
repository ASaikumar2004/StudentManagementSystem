# 🎓 Student Management System

A simple **Java console-based Student Management System** developed to practice Java Collections and Object-Oriented Programming concepts.

The application allows users to perform basic **CRUD operations** on student records using an `ArrayList`.

## 📌 Features

* ➕ Add Student
* 👀 View Students
* ✏️ Update Student
* 🗑️ Delete Student
* 🚪 Exit Application

## 🛠️ Technologies & Concepts Used

* **Java**
* **ArrayList** – Used to store student objects
* **Iterator** – Used for traversing and deleting student records
* **ListIterator** – Used while updating student records
* **OOP Concepts**

  * Classes & Objects
  * Encapsulation
  * Constructors
  * Getters & Setters
* **Scanner** – Used to take input from the user
* **Switch Case** – Used to create the menu-driven application

## 📂 Project Structure

```text
StudentManagementSystem
│
├── Student.java
├── StudentService.java
└── Main.java
```

### `Student.java`

Contains the `Student` class with student information such as:

* Student ID
* Student Name
* Student Age
* Student Marks

### `StudentService.java`

Contains the methods for performing CRUD operations:

```text
addStudent()
viewStudents()
updateStudent()
deleteStudent()
```

### `Main.java`

Contains the main method and provides a menu-driven interface for the user.

## 🖥️ Application Menu

```text
=================================
     STUDENT MANAGEMENT SYSTEM
=================================

1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Enter your choice:
```

## 🔄 CRUD Operations

### Create — Add Student

The user can add a new student by entering:

```text
Student ID
Student Name
Student Age
Student Marks
```

The student object is then stored in the `ArrayList`.

### Read — View Students

Displays all the students currently stored in the `ArrayList`.

### Update — Update Student

The user enters the student ID and provides the updated student information.

`ListIterator` is used to locate and replace the student object.

### Delete — Delete Student

The user enters the student ID that needs to be removed.

`Iterator` is used to safely remove the student from the `ArrayList`.

## 🧠 What I Learned

Through this project, I practiced:

* Working with `ArrayList`
* Using `Iterator` and `ListIterator`
* Performing CRUD operations
* Creating menu-driven Java applications
* Applying OOP concepts in a practical project
* Taking user input using `Scanner`
* Managing objects inside collections

## 🚀 Future Enhancements

The application can be extended with:

* Search Student functionality
* Sorting students using `Comparable` and `Comparator`
* Duplicate ID validation
* Input validation
* MySQL database integration using JDBC
* GUI interface
* Spring Boot REST API

## 👨‍💻 Author

**Sai Kumar**

This project was created as a practical exercise while learning **Core Java and Java Collections**.
