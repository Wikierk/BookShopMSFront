/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshopmanagementsystem.interfaces;

import java.math.BigDecimal;

/**
 *
 * @author Wiktor
 */
public class Book {
    public Book(String title, String author, BigDecimal price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    private String title;
    private String author;
    private BigDecimal price;
    
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
     public BigDecimal getPrice(){
        return this.price;
    }
     
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
