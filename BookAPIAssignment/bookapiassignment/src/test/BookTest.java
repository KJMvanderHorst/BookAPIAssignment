import org.junit.jupiter.api.Assertions.*;

import com.group87.bookapiassignment.BookCatalog.Book;

import org.junit.jupiter.api.Test;

public class BookTest {
    
    @Test
    void testBookConstructorGettersAndSetters(){
        Book testBook = new Book("123", "Lord of the Rings", "JK Rowling", "20000000");
        assertEquals(testBook.getAuthor(),"JK Rowling");
        assertEquals(testBook.getId(),"123");
        assertEquals(testBook.getPublicationYear(),"20000000");
        assertEquals(testBook.getTitle(),"Lord of the Rings");
        testBook.setAuthor("Konrad Clemens");
        testBook.setId("838");
        testBook.setPublicationYear("984");
        testBook.setTitle("Lord of the Flies");
        assertEquals(testBook.getAuthor(),"Konrad Clemens");
        assertEquals(testBook.getId(),"838");
        assertEquals(testBook.getPublicationYear(),"984");
        assertEquals(testBook.getTitle(),"Lord of the Flies");
    }
}
