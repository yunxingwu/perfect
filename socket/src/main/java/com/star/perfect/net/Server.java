package com.star.perfect.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  伍运星  on   2016/1/25.
 */

public class Server {
    private List<ServerRunable> clients = new ArrayList<ServerRunable>();
    private  ServerSocket serverSocket;
    private static int serverPort = 20166;
    public void init(){
        try {
            serverSocket = new ServerSocket(serverPort);
            startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void register(){

    }

    public void startServer() throws IOException {
        System.out.println("服务start...");
            Socket socket = serverSocket.accept();
            System.out.println("accept client:"+socket);
            ServerRunable runable = new ServerRunable(socket);
           new  Thread(runable).start();
        }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.init();
    }
}
