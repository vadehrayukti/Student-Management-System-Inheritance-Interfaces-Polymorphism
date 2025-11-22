# Student-Management-System-Inheritance-Interfaces-Polymorphism
A Java-based Student Management System built using inheritance, polymorphism, method overriding, method overloading, and interfaces. It includes an abstract Person class, a Student class extending it, a RecordActions interface, and a StudentManager class ensuring duplicate roll numbers are prevented.

 Features

- Add student records  
- Delete student records  
- Update existing student details  
- View all student records  
- Prevent duplicate roll numbers  
- Demonstrates:
  - **Inheritance** (`Person` → `Student`)
  - **Abstract class implementation**
  - **Interfaces** (`RecordActions`)
  - **Polymorphism**
  - **Method Overriding**
  - **Method Overloading**
  - **Encapsulation**
- Easy-to-understand modular structure

---

##  System Architecture

### **1. Person (Abstract Class)**
- Common fields:  
  - `name`  
  - `email`  
- Abstract method:  
  - `displayInfo()`

---

### **2. Student (Extends Person)**
Additional fields:  
- `rollNo`  
- `course`  
- `marks`  
- `grade`

Methods:  
- `calculateGrade()`  
- `inputDetails()`  
- `displayDetails()`  
- **Overrides**: `displayInfo()` (from Person)  
- **Overloading**: Constructors  

---

### **3. RecordActions (Interface)**
Methods declared:  
- `addStudent()`  
- `deleteStudent()`  
- `updateStudent()`  
- `viewStudents()`

---

### **4. StudentManager**
- Implements `RecordActions`  
- Manages students using a collection (ArrayList or HashMap)  
- Prevents duplicate roll numbers  
- Provides overridden functionality for record operations  

---

##  Sample Output

===== Student Management Menu =====

Add Student

View Students

Update Student

Delete Student

Exit
Enter your choice: 1

Enter Roll No: 101
Enter Name: yukti
Enter Email: yukti@mail.com
Enter Course: btech
Enter Marks: 90
Student added successfully!

Author- Yukti vadehra
