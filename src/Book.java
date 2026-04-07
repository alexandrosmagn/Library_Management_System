public class Book {
    private String title;
    private String author;
    private int year;
    private BookCategory category;

    public Book(String title, String author, int year, BookCategory category) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public BookCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ") - " + category;
    }
}
