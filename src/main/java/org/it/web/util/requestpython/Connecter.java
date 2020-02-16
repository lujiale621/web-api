package org.it.web.util.requestpython;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connecter{
    private PrintStream javaout;
    private Socket socket;
    public Connecter(int port){
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
            String host=address.getHostName();
            socket = new Socket(host,port);
            OutputStream os = socket.getOutputStream();
            javaout = new PrintStream(os);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public PrintStream getJavaout() {
        return javaout;
    }
    public void setJavaout(PrintStream javaout) {
        this.javaout = javaout;
    }
    public Socket getSocket() {
        return socket;
    }
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}