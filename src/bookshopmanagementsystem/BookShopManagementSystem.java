/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookshopmanagementsystem;

import java.io.IOException;

/**
 *
 * @author Wiktor
 */
public class BookShopManagementSystem {
    public static final int port = 666;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
        java.awt.EventQueue.invokeLater(BookShopManagementSystem::startClient);
    }

    public static void startClient() {
        try {
            Client client = new Client();
            client.startConnection("127.0.0.1", port);
            String response = client.sendMessage("test");
            System.out.println(response);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
}
