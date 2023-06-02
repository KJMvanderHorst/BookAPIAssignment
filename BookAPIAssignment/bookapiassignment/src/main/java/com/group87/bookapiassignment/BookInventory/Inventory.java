package com.group87.bookapiassignment.BookInventory;

import java.util.HashMap;

public class Inventory {
    // when added to catalog the initial value should set here as well, this has to be done with api i think

    HashMap<Book, Integer> inventoryList;

    public Inventory(){
        inventoryList = new HashMap<>();
    }

    public void addBook(Book book, int quantity){
        inventoryList.put(book, quantity);
    }

    public void changeQuantity(Book book, int newQuantity){
        if(inventoryList.containsKey(book)){
            inventoryList.put(book, newQuantity);
        }
    }
}
