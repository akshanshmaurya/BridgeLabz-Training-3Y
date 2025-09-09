package accessModifiers;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // public
        System.out.println("Title: " + title); // protected
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("Format: " + format);
    }
}
