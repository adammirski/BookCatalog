/*How Extended Classes Are Used in This Program

	1.	Base Class (Book):
	
The program defines an abstract class called Book. This class contains properties common to all types of books, such as title, author, isbn, and year, and declares abstract methods like displayInfo() and performAction().

The Book class is abstract, meaning it cannot be instantiated directly. It serves as a base class that other specific book types will inherit from.
	
	2.	Extended (Subclass) Classes:
	•	The program defines three classes that extend the Book class:
	•	PrintBook: Represents a physical book with an additional attribute, numPages, which stores the number of pages.
	•	EBook: Represents an electronic book with an additional attribute, fileSizeMB, to store the file size in megabytes.
	•	AudioBook: Represents an audiobook with an additional attribute, durationMinutes, which stores the length of the audiobook in minutes.
	•	Each of these subclasses inherits the common properties and methods from Book, and they override the abstract methods (displayInfo() and performAction()) to provide specific behavior for each book type.


Summary of Extended Classes in the Program

Inheritance is used to create PrintBook, EBook, and AudioBook as extended classes from the base class Book.

Each subclass inherits properties and methods from Book but overrides methods to provide behavior specific to each book type.

This design allows the program to handle different types of books in a unified way (e.g., storing them in a single BookCatalog list) while allowing each type of book to have unique details and behaviors.

Example of Inheritance in the Program*/

import java.util.ArrayList;


public class BookCatalog{

    ArrayList<Book> booklog;

    public BookCatalog() {
        booklog = new ArrayList<Book>();
    }
    
    //add book
    public void add(Book book) {
        booklog.add(book);
    }
    
    //remove book
   
    //search by name
    public void printDetails() {
        for(Book b: booklog) {
            b.displayInfo();
    }
    }
    
    
    }