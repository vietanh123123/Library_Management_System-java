import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books; 

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayBooks() {
        for (Book book : books) {
            if (book.getIsAvailable()) {
                System.out.println("Title: " + book.getTitle() + " , Author: " + book.getAuthor() + " , Category: " + book.getCategory());   
            } 
        }
    }
    public void findBooksByCategory(String category) {
        System.out.println("Books in category " + category + ": ");
        for (Book book : books) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }
    public void findBooksByTitle(String title) {
        System.out.println("Books with title " + title + ": ");
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }
    public void findBooksByAuthor(String author) {
        System.out.println("Books by author " + author + ": ");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    public static void exportBooksToFile(Library library, String fileName) {
        try {
            if(!fileName.endsWith(".txt")) {
                fileName += ".txt";
            }
            
            java.io.FileWriter writer = new java.io.FileWriter(fileName);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(writer);

            printWriter.println("Library Book Catalogue:");
            printWriter.println("-------------------------");
            printWriter.println();

            for (Book book : library.books) {
                printWriter.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Category: " + book.getCategory());
            }
            printWriter.close();
            System.out.println("Books exported successfully to " + fileName);
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while exporting books to file: " + e.getMessage());
        }
    }
}
