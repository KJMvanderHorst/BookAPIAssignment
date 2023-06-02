package com.group87.bookapiassignment.BookOrder;

import java.util.ArrayList;

public class OrderController {

    private ArrayList<Order> orders = new ArrayList<>();

    public orderBook(String bookId, int orderQuantity){
        // here i have to get the book from the catalogue and get the id through api
        Order currentOrder = new Order(,orderQuantity, String.valueOf(System.currentTimeMillis())))
        orders.add(currentOrder);
        // when the order is placed also remove this quantity through the api
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }
}
