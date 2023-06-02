import org.junit.jupiter.api.Assertions.*;

import com.group87.bookapiassignment.BookCatalog.Book;
import com.group87.bookapiassignment.BookInventory.Inventory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class InventoryTest {

    private Inventory testInventory;

    @BeforeEach
    public void setUp() {
        testInventory = new Inventory();
    }

    @Test
    void testAddNewBookToInventory(){
        Book testBook = new Book("001", "Lord of the Kings", "Thomas", "1234");
        testInventory.addBook(testBook, 999);
        assertEquals(testInventory.getInventory().get(testBook),999);
    }

    @Test
    void testChangeQuantity(){
        Book testBook = new Book("001", "Lord of the Kings", "Thomas", "1234");
        testInventory.addBook(testBook, 999);
        testInventory.changeQuantity(testBook, 0);
        assertEquals(testInventory.getInventory().get(testBook),0);
    }

    @Test
    void testIsAvailable(){
        Book testBook = new Book("001", "Lord of the Kings", "Thomas", "1234");
        testInventory.addBook(testBook, 999);
        assertTrue(testInventory.isAvalaible(testBook));
    }

    @Test
    void getQuantity(){
        Book testBook = new Book("001", "Lord of the Kings", "Thomas", "1234");
        testInventory.addBook(testBook, 999);
        assertEquals(testInventory.getQuantity(testBook),999);
    }
}
