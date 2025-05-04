import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String email;
    String phoneNumber;
    List<Book> borrowedBooks;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }
    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addBook(Book book ) {
        this.borrowedBooks.add(book);
    }
    public void removeBook(Book book) {
        this.borrowedBooks.remove(book);
    }
    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books: ");
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
