// Library Management System
// Demonstrates: Abstract Class, Interface, Encapsulation, Polymorphism

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 21; }
    @Override
    public void reserveItem(String borrower) {
        this.borrower = borrower;
        available = false;
    }
    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 7; }
    @Override
    public void reserveItem(String borrower) {
        this.borrower = borrower;
        available = false;
    }
    @Override
    public boolean checkAvailability() { return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    private String borrower;
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() { return 14; }
    @Override
    public void reserveItem(String borrower) {
        this.borrower = borrower;
        available = false;
    }
    @Override
    public boolean checkAvailability() { return available; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001", "Java Basics", "John Doe"),
            new Magazine("M001", "Tech Today", "Jane Smith"),
            new DVD("D001", "OOPs Concepts", "Alan Turing")
        };
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                ((Reservable)item).reserveItem("User1");
                System.out.println("Available: " + ((Reservable)item).checkAvailability());
            }
            System.out.println();
        }
    }
}
