import org.junit.jupiter.api.Assertions.*;

import com.group87.bookapiassignment.BookCatalog.Book;
import com.group87.bookapiassignment.BookOrder.OrderController;

import org.junit.jupiter.api.Test;

public class OrderControllerTest {

    @Test
    void testOrderController(){
        OrderController testOrderController = new OrderController();
        testOrderController.orderBook(new Book("001", "Yes", "ME", "1901"), 100);
        assertEquals(testOrderController.getOrders().get(0).getOrderQuantity(),100);
    }
}
