package com.star.perfect.net;

import java.io.*;
import java.net.Socket;

/**
 * Created by  伍运星  on   2016/1/25.
 */

public class SocketClient {
    public void startClient() throws IOException {
        Socket socket = new Socket("127.0.0.1",2016);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        String info = reader.readLine();
        while (!info.equals("end")) {
            printWriter.println(info);
            printWriter.flush();
        }
        printWriter.close();
        socket.close();

    }

    public static void main(String[] args) throws IOException {
        SocketClient client = new SocketClient();
        client.startClient();
    }
}
