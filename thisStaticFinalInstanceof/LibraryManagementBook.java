
package thisStaticFinalInstanceof;
// Sample Program 2: Library Management System
// Demonstrates: static, this, final, instanceof

public class LibraryManagementBook {
    static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public LibraryManagementBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof LibraryManagementBook) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        LibraryManagementBook b1 = new LibraryManagementBook("Java Basics", "John Doe", "ISBN123");
        LibraryManagementBook b2 = new LibraryManagementBook("OOPs Concepts", "Jane Smith", "ISBN456");
        b1.displayDetails();
        b2.displayDetails();
        LibraryManagementBook.displayLibraryName();
    }
}
