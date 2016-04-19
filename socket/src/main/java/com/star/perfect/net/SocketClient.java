package com.star.perfect.net;

import java.io.*;
import java.net.Socket;

/**
 * Created by  伍运星  on   2016/1/25.
 */

public class SocketClient {
    public void startClient() throws IOException {
        Socket socket = new Socket("127.0.0.1",20166);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        String info = "aaa";
            printWriter.println(info);
            printWriter.flush();
        printWriter.close();
        socket.close();

    }

    public static void main(String[] args) throws IOException {
        SocketClient client = new SocketClient();
        client.startClient();
    }
}
