import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        // Create a library instance
        // There are five categories of books: Fiction, Educations, Science, History, and Technology.
        Library library = new Library();
        // Create some book instances
        
        // Fiction books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction");
        Book book3 = new Book("1984", "George Orwell", "Fiction");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "Fiction");
        
        // Education books
        Book book5 = new Book("How to Study", "Ron Fry", "Education");
        Book book6 = new Book("The Elements of Style", "William Strunk Jr.", "Education");
        Book book7 = new Book("Mindset: The New Psychology of Success", "Carol S. Dweck", "Education");
        Book book8 = new Book("Make It Stick", "Peter C. Brown", "Education");
        
        // Science books
        Book book9 = new Book("A Brief History of Time", "Stephen Hawking", "Science");
        Book book10 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Science");
        Book book11 = new Book("The Gene: An Intimate History", "Siddhartha Mukherjee", "Science");
        Book book12 = new Book("Silent Spring", "Rachel Carson", "Science");
        
        // History books
        Book book13 = new Book("Guns, Germs, and Steel", "Jared Diamond", "History");
        Book book14 = new Book("The Silk Roads", "Peter Frankopan", "History");
        Book book15 = new Book("SPQR: A History of Ancient Rome", "Mary Beard", "History");
        Book book16 = new Book("The Crusades: The War for the Holy Land", "Thomas Asbridge", "History");
        
        // Technology books
        Book book17 = new Book("Clean Code", "Robert C. Martin", "Technology");
        Book book18 = new Book("Design Patterns", "Erich Gamma et al.", "Technology");
        Book book19 = new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas", "Technology");
        Book book20 = new Book("Artificial Intelligence: A Modern Approach", "Stuart Russell and Peter Norvig", "Technology");

        Book[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12,
                book13, book14, book15, book16, book17, book18, book19, book20};
        
        //Add books to the library
        for (Book book : books) {
            library.addBook(book);
        }

        // Start the command line interface 
        runLibraryInterface(library);
   }

  private static void runLibraryInterface(Library library) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; 
        while (running) {
            System.out.println("Welcome to the Library Management System!");
            System.out.println("1. Display all available books");
            System.out.println("2. Add a new book");
            System.out.println("3. Find books by category");
            System.out.println("4. Search a book by title ");
            System.out.println("5. Search a book by author ");
            System.out.println("6. Export books to a file");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
    
                switch (choice) {
                    case 0:
                        running = false;
                        System.out.println("Thank you for using the Library Management System. Goodbye!");
                        break;
                    case 1:
                        library.displayBooks();
                        break;
                    case 2:
                        // Handle String, author, and category inputs
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter the author of the book: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter the category of the book: ");
                        String category = scanner.nextLine();
                        Book newBook = new Book(title, author, category);
                        library.addBook(newBook);
                        System.out.println("Book added successfully!");
                        break;
                    case 3:
                        System.out.print("Enter the category of the book: ");
                        String searchCategory = scanner.nextLine();
                        library.findBooksByCategory(searchCategory);
                        break;
                    case 4: 
                        System.out.print("Enter the title of the book: ");
                        String searchTitle = scanner.nextLine();
                        library.findBooksByTitle(searchTitle);
                        break;
                    case 5: 
                        System.out.print("Enter the author of the book: ");
                        String searchAuthor = scanner.nextLine();
                        library.findBooksByAuthor(searchAuthor);
                        break;
                    case 6:
                        System.out.print("Enter the file name to export books: ");
                        String fileName = scanner.nextLine();
                        library.exportBooksToFile(library, fileName);
                        System.out.println("Books exported successfully to " + fileName);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }    
     scanner.close();
   } 
        
}