package inheritance.singleInheritance;
// Single Inheritance - Library Management with Books and Authors
// Demonstrates: Single Inheritance

class Book {
    protected String title;
    protected int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryManagementBookAuthor {
    public static void main(String[] args) {
        Author a = new Author("OOPs in Java", 2022, "John Doe", "Java Expert");
        a.displayInfo();
    }
}
