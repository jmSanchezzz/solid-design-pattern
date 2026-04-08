# Refactoring the NEU Library System Using SOLID Principles

## Problem Statement
The original NEU Library system design violated the **Dependency Inversion Principle (DIP)** and the **Open/Closed Principle (OCP)**. 

Initially, the high-level `Student` class was tightly coupled to specific low-level resource classes through hardcoded methods like `borrowBook()` and `borrowJournal()`. This tight coupling meant that if the library needed to support new resource types in the future (such as Audio Books, E-Journals, or Capstone projects), developers would have to modify the existing `Student` class to add new methods. This approach is not scalable and increases the risk of introducing bugs into existing, working code.

### Proposed Solution
To ensure flexibility and compliance with SOLID principles, the system was refactored by introducing a `Resource` abstraction (interface). 
* **DIP Applied:** The `Student` class now depends on the `Resource` interface instead of concrete classes. 
* **OCP Applied:** By replacing specific borrowing methods with a single `borrowResource(Resource resource, String title)` method, the system is now open for extension but closed for modification. New resource types can seamlessly be added by implementing the `Resource` interface without ever modifying the `Student` class.

## UML Class Diagram of Proposed Solution

<img width="1369" height="605" alt="Untitled Diagram drawio" src="https://github.com/user-attachments/assets/de2f458d-e13f-42ea-84c0-51d389300952" />
