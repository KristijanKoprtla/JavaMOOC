
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int bookPages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Publication year: ");
            int bookYear = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(bookTitle, bookPages, bookYear));

        }
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();

        for (Book book : books) {
            if (info.contains("everything")) {
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }

    }
}
