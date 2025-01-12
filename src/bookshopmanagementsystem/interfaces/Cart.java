/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshopmanagementsystem.interfaces;

import bookshopmanagementsystem.interfaces.Book;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wiktor
 */
public class Cart {
    private static Cart instance;
    private final List<Book> books;
    private Runnable updateListener;
    private BigDecimal totalValue;

    private Cart() {
        books = new ArrayList<>();
        totalValue = new BigDecimal("0");
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addItem(Book book) {
        books.add(book);
        this.totalValue = this.totalValue.add(book.getPrice());
        if (updateListener != null) {
            updateListener.run();
        }
    }
    
    public void removeItem(Book book) {
        books.remove(book);
        this.totalValue = this.totalValue.subtract(book.getPrice());
        if (updateListener != null) {
            updateListener.run();
        }
    }


    public List<Book> getItems() {
        return books;
    }
    
    public BigDecimal getTotalValue() {
        return this.totalValue;
    }
    
    public void setUpdateListener(Runnable listener) {
        this.updateListener = listener;
    }
}
