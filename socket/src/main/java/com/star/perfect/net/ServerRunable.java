package com.star.perfect.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by  伍运星  on   2016/1/26.
 */

public class ServerRunable implements Runnable {
    private Socket socket;
    ServerRunable(Socket socket){
        this.socket = socket;
    }
    public void send(){

    }
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String info = reader.readLine();
            System.out.println("客户端发送的消息："+info);
            reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
