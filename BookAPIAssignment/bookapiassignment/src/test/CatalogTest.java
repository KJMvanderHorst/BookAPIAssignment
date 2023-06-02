import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import com.group87.bookapiassignment.BookCatalog.Book;
import com.group87.bookapiassignment.BookCatalog.Catalog;

import org.junit.jupiter.api.Test;

public class CatalogTest {

    private Catalog testCatalog;

    @BeforeEach
    public void setUp() {
        testCatalog = new Catalog();
        testCatalog.createBook("123", "Lord of the Flies", "Kasper", "1984");
        testCatalog.createBook("321", "Lord of the Rings", "Konrad", "0000");
        testCatalog.createBook("001", "Lord of the Tables", "Kasper" , "1999");
    }

    @Test
    void testCreateBook(){
        assertTrue(testCatalog.getCatalog() != null);
    }

    @Test
    void testReadBookByIdentifier(){
        Book book = catalog.readBookByID("123");
        assertEquals("123", book.getId());
        assertEquals("Lord of the Flies", book.getTitle());
        assertEquals("Kasper", book.getAuthor());
        assertEquals("1984", book.getPublicationYear());
    }

    @Test
    void testReadBookByAuthor(){
        ArrayList<Books> books = testCatalog.readBooksByAuthor("Kasper");
        assertEquals("123", books.get(0).getId());
        assertEquals("Lord of the Flies", books.get(0).getTitle());
        assertEquals("Kasper", books.get(0).getAuthor());
        assertEquals("1984", books.get(0).getPublicationYear());
        assertEquals("001", books.get(1).getId());
        assertEquals("Lord of the Tables", books.get(1).getTitle());
        assertEquals("Kasper", books.get(1).getAuthor());
        assertEquals("1999", books.get(1).getPublicationYear());
    }

    @Test
    void testReadBookByPublicationYear(){
        ArrayList<Books> books = testCatalog.readBooksByYear("1999");
        Book book = books.get(0);
        assertEquals("001", book.getId());
        assertEquals("Lord of the Tables", book.getTitle());
        assertEquals("Kasper", book.getAuthor());
        assertEquals("1999", book.getPublicationYear());
    }

    @Test
    void testReadBookByTitle(){
        ArrayList<Books> books = testCatalog.readBooksByTitle("Lord of the Rings");
        Book book = books.get(0);
        assertEquals("321", book.getId());
        assertEquals("Lord of the Rings", book.getTitle());
        assertEquals("Konrad", book.getAuthor());
        assertEquals("0000", book.getPublicationYear());
    }

    @Test
    void testReadBookByFalseID() {
        Book book = catalog.readBookByID("9393939393");
        assertNull(book);
    }

    @Test
    void testUpdateBookIdentifier(){
        testCatalog.updateBookIdentifier("123", "555");
        assertTrue(testCatalog.readBookByID("555").getAuthor(), "Kasper");
    }

    @Test
    void testUpdateBookAuthor(){
        testCatalog.updateBookAuthor("123", "Olaf");
        assertTrue(testCatalog.readBookByID("123").getAuthor(), "Olaf");
    }

    @Test
    void testUpdateBookPublicationYear(){
        testCatalog.updateBookAuthor("123", "7777");
        assertTrue(testCatalog.readBookByID("123").getPublicationYear(), "7777");
    }

    @Test
    void testUpdateBookTitle(){
        testCatalog.updateBookTitle("123", "Olaf");
        assertTrue(testCatalog.readBookByID("123").getTitle(), "Olaf");
    }
}
