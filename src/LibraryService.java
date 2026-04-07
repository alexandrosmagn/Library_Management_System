import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryService {

   private Map<String,Book> library = new HashMap<>();

    public LibraryService(Map<String, Book> library) {
        this.library = new HashMap<>(library);
    }

    public LibraryService() {
        this.library = new HashMap<>();
    }

    public void addBook(String title,Book book) {
        library.put(title, book);
    }

    public Optional <Book> getBook(String title) {
        return Optional.ofNullable(library.get(title));
    }
    
    public void deleteBook(String title) {
        if(library.containsKey(title)) {
            library.remove(title);
            System.out.println(title + " was deleted from library");
        }
        else {
            System.out.println("There is no such book");
        }
    }

    public void listAll() {
        for(Map.Entry<String,Book> bookEntry: library.entrySet()) {
            System.out.println(bookEntry.getKey() + ": " + bookEntry.getValue());
        }
    }

    public void searchByAuthor(String author) {
       List<Book> authors = library.values()
               .stream()
               .filter(book -> book.getAuthor().equals(author))
               .collect(Collectors.toList());
       authors.forEach(System.out::println);
    }

}
