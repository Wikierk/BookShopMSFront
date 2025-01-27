/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshopmanagementsystem.interfaces;

import com.example.interfaces.BookInCart;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wiktor
 */
public class Cart {
    private static Cart instance;
    private final List<BookInCart> books;
    private Runnable updateListener;
    private Runnable updateValueListener;
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

    public void addItem(BookInCart book) {
        books.add(book);
        this.totalValue = this.totalValue.add(book.getBook().getPrice());
        if (updateListener != null) {
            updateListener.run();
        }
    }
    
    public void removeItem(BookInCart book) {
        books.remove(book);
        this.totalValue = new BigDecimal(0);
        if (updateListener != null) {
            updateListener.run();
        }
    }


    public List<BookInCart> getItems() {
        return books;
    }
    
    public BigDecimal getTotalValue() {
        return this.totalValue;
    }
    
       public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
         if (updateListener != null) {
            updateListener.run();
        }
    }
    
    public void setUpdateListener(Runnable listener) {
        this.updateListener = listener;
    }
    
        public void setUpdateValueListener(Runnable listener) {
        this.updateValueListener = listener;
    }
    
    public void recalculateTotalValue() {
 
    BigDecimal newTotalValue = BigDecimal.ZERO;

    for (BookInCart book : books) {
        BigDecimal bookTotal = book.getBook().getPrice().multiply(BigDecimal.valueOf(book.getQuantity()));
        newTotalValue = newTotalValue.add(bookTotal);
    }

    this.totalValue = newTotalValue;

    if (updateValueListener != null) {
        updateValueListener.run();
    }
}
}

