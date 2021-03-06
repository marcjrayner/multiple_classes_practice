import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library myLibrary;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        myLibrary = new Library();
        book1 = new Book("Harry Potter", "JK Rowling", "Teen");
        book2 = new Book("Harry Potter 2", "JK Rowling", "Teen");
    }

    @Test
    public void hasBooksArrayList() {
        assertEquals(0, myLibrary.countBooks());
    }

    @Test
    public void canAddBook() {
        myLibrary.addBook(book1);
        assertEquals(1, myLibrary.countBooks());
    }

    @Test
    public void canCheckIfStockFullFalse() {
        assertEquals(false, myLibrary.checkIfStockFull());
    }

    @Test
    public void canCheckIfStockFullTrue() {
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        assertEquals(true, myLibrary.checkIfStockFull());
    }

    @Test
    public void wontAddBookIfStockFull() {
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        myLibrary.addBook(book1);
        assertEquals(3, myLibrary.countBooks());
    }

    @Test
    public void canRemoveSpecifiedBook() {
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        Book returnedBook = myLibrary.removeBook(book2);
        assertEquals(book2, returnedBook);
    }

}
