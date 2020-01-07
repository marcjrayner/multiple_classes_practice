import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
