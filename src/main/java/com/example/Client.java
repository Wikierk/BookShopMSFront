package com.example;

import java.net.*;
import java.io.*;

public class Client {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws IOException {
        socket = new Socket(ip, port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public String sendMessage(String message) throws IOException {
        out.println(message);
        return in.readLine();
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
