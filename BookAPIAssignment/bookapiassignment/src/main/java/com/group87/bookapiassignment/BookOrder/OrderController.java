package com.group87.bookapiassignment.BookOrder;

import java.util.ArrayList;

public class OrderController {

    private ArrayList<Order> orders = new ArrayList<>();

    public orderBook(Book book, int orderQuantity){
        Order currentOrder = new Order(book,orderQuantity, String.valueOf(System.currentTimeMillis())))
        orders.add(currentOrder);
        // when the order is placed also remove this quantity through the api
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }
}
