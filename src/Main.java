import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LibraryService machine = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("exit")) {
                break;
            } else if (command.equals("add")) {
                Book book = new Book(parts[1], parts[2], Integer.parseInt(parts[3]), BookCategory.valueOf(parts[4].toUpperCase()));
                machine.addBook(parts[1], book);
            } else if (command.equals("get")) {
                System.out.println(machine.getBook(parts[1])
                                .map(Book::toString)
                        .orElse("Book not found"));
            } else if (command.equals("delete")) {
                machine.deleteBook(parts[1]);
            } else if (command.equals("list")) {
                machine.listAll();
            } else if (command.equals("search")) {
                machine.searchByAuthor(parts[1]);
            }

        }
    }
}
