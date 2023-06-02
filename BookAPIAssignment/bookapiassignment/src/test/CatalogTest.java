import org.junit.jupiter.api.Assertions.*;

import com.group87.bookapiassignment.BookCatalog.Book;
import com.group87.bookapiassignment.BookCatalog.Catalog;

import org.junit.jupiter.api.Test;

public class CatalogTest {

    Catalog testCatalog = new Catalog();
    testCatalog.createBook(new Book());

}
