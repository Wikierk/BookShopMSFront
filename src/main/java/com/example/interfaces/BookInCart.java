/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.interfaces;

import com.example.dto.BookDto;

/**
 *
 * @author wiktor
 */
public class BookInCart {
    private BookDto book;
    private int bookQuantity;
    
    public BookDto getBook() {
        return this.book;
    }
    
    public int getQuantity() {
        return this.bookQuantity;
    }
    
    public void setBook(BookDto book) {
        this.book = book;
    }
    
    public void setQuantity(int quantity){
        this.bookQuantity = quantity;
    }
    
    public BookInCart(BookDto book, int bookQuantity){
        this.book = book;
        this.bookQuantity = bookQuantity;
    }
}
