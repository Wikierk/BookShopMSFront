/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import java.io.IOException;

/**
 * The BookShopManagementSystem class serves as the entry point of the application.
 * It initializes the main GUI frame and starts the client connection to the server.
 * 
 * @author Wiktor
 */
public class BookShopManagementSystem {
     /**
     * The port number on which the client connects to the server.
     */
    public static final int port = 4200;
     /**
     * The client instance used for communication with the server.
     */
    private static Client client;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
        java.awt.EventQueue.invokeLater(BookShopManagementSystem::startClient);
    }
    /**
     * Initializes and starts the client connection to the server.
     * The client attempts to connect to the localhost at the predefined port.
     */
    public static void startClient() {
        try {
            client = new Client();
            client.startConnection("127.0.0.1", port);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
     /**
     * Retrieves the client instance.
     * 
     * @return the current client instance
     */
     public static Client getClient() {
        return client;
    }
    
}
