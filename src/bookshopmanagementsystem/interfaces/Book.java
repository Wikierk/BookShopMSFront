/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshopmanagementsystem.interfaces;

/**
 *
 * @author Wiktor
 */
public class Book {
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    private String title;
    private String author;
    private double price;
    
    public String getTitle(){
        return this.title;
    }
     public String getAuthor(){
        return this.author;
    }
      public Double getPrice(){
        return this.price;
    }
}
