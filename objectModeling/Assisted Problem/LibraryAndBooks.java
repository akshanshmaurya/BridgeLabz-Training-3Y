import java.util.ArrayList;


class Book {
    private String title;
    private String author;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}


class Library {
    private String name;
    private ArrayList<Book> books;

    
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }

    
    public void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book b : books) {
            System.out.println(" - " + b);
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee");

        
        Library centralLibrary = new Library("Central");
        Library communityLibrary = new Library("Community");

        
        centralLibrary.addBook(b1);
        centralLibrary.addBook(b2);

        communityLibrary.addBook(b2);  
        communityLibrary.addBook(b3);

        
        centralLibrary.showBooks();
        System.out.println();
        communityLibrary.showBooks();
    }
    
}
