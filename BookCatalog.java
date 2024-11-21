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
import java.util.Scanner;


public class BookCatalog{

    ArrayList<Book> booklog;
    Scanner input = new Scanner(System.in);

    public BookCatalog() {
        booklog = new ArrayList<Book>();
    }
    
    //add book
   public void addBook() {
        
        System.out.println("Type of book: ");
        System.out.println("1. Print book");
        System.out.println("2. eBook");
        System.out.println("3. Audiobook");
        System.out.println("Enter selection: ");
        int book_type = input.nextInt();
        input.nextLine();



        System.out.print("Enter Title: ");
        String title = input.nextLine();
        System.out.print("Enter Author: ");
        String author = input.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = input.nextLine();
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        input.nextLine();

        int pages = 0;
        double file_size = 0;
        int duration = 0;

        switch (book_type) {
            case 1:
                System.out.print("Enter number of pages: ");
                pages = input.nextInt();
                booklog.add(new PrintBook(title,author,isbn,year,pages));
                break;
            case 2:
                System.out.print("Enter file size(MB): ");
                file_size = input.nextDouble();
                booklog.add(new EBook(title,author,isbn,year,file_size));
                break;
            case 3:
                System.out.print("Enter duration(minutes): ");
                duration = input.nextInt();
                booklog.add(new AudioBook(title,author,isbn,year,duration));
                break;

        }
        System.out.println("Book added.");
        



    }
    
    //remove book
    public int removeBook() {
        
        System.out.println("Please enter an isbn to remove");
        if (input.hasNextLine()) {
            input.nextLine();
        }
        String isbn = input.nextLine();
        
        
        for(int i = 0; i < booklog.size(); i++) {
            if(booklog.get(i).getIsbn().toLowerCase().equals(isbn) ) {
                booklog.remove(i);
                return 0;

            }
            
        }
        System.out.println("Book with ISBN '" + isbn + "' not found.");
        return -1;

    }

    public void sortBooks() {
        booklog.sort(null);
    }
   
    /***************searchBook()****************
     *The method iterates over a list of Book objs
     *(booklog) but the booklog list can store objs
     *of any class that extends Book bc of polymorphism.
     *********************************************/
    public Book searchBook() {
        
        System.out.println("Enter Title");
        String title = input.nextLine();
        for (Book book : booklog) {
            if (book.getTitle().equalsIgnoreCase(title)) { // case insensitive
                System.out.println("Book found:");
                book.displayInfo();
                return book;
            }
        }
        System.out.println("Book '" + title + "' not found.");
        return null;
    }
    
        public void markAsRead() {
        Book book = searchBook();
        if (book != null) {
            book.setRead(true);
            System.out.println("Marked as read: " + book.getTitle());
        }
    }
    public void printDetails() {
        int count = 0;
        for(Book b: booklog) {
            System.out.print("#" + count);
            b.displayInfo();
            count++;
    }
    }
    
    
    }
