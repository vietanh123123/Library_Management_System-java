package Core; 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Book {
    private String isbn;   // Primary Key which is unique for each book
    private String title;
    private String author; 
    private String subject; 
    private String publisher;
    private LocalDate publishDate;
    private String language;
    private int numPages;
    private List<String> genres; // List of genres

    public Book(String isbn, String title, String author, String subject, String publisher, LocalDate publishDate, String language, int numPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.language = language;
        this.numPages = numPages;
        this.genres = new ArrayList<>();
    }
}