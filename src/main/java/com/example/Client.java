package com.example;

import java.net.*;
import java.io.*;
/**
 * The Client class handles the connection to a server via a socket.
 * It allows sending messages to the server and receiving responses.
 * This class provides methods to start the connection, send messages, and stop the connection.
 * 
 * @author Wiktor
 */
public class Client {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    /**
     * Establishes a connection to the server.
     * 
     * @param ip the IP address of the server.
     * @param port the port number to connect to on the server.
     * @throws IOException if an I/O error occurs when creating the socket or setting up streams.
     */
    public void startConnection(String ip, int port) throws IOException {
        socket = new Socket(ip, port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    /**
     * Sends a message to the server and waits for a response.
     * 
     * @param message the message to send to the server.
     * @return the response from the server.
     * @throws IOException if an I/O error occurs while sending the message or receiving the response.
     */
    public String sendMessage(String message) throws IOException {
        out.println(message);
        return in.readLine();
    }
    /**
     * Closes the connection to the server and releases the resources.
     * 
     * @throws IOException if an I/O error occurs while closing the streams or socket.
     */
    public void stopConnection() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
