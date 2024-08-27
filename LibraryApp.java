import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    System.out.println("Book added.");
                }

                case 2 -> {
                    System.out.print("Enter book ISBN to remove: ");
                    String ISBN = scanner.nextLine();
                    library.removeBook(ISBN);
                    System.out.println("Book removed.");
                }

                case 3 -> library.displayAllBooks();

                case 4 -> {
                    System.out.print("Enter book title to search: ");
                    String title = scanner.nextLine();
                    library.searchBookByTitle(title);
                }

                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
