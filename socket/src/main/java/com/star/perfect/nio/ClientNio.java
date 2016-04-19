package com.star.perfect.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by  wuyunxing on   2016/4/18.
 */

public class ClientNio {
    private  Selector selector;
    public void init(String adr,int port) throws IOException {
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
         selector = Selector.open();
        channel.connect(new InetSocketAddress(adr,port));
        channel.register(selector,SelectionKey.OP_CONNECT);
    }
    public void listen() throws IOException {
        while (true){
            selector.select();
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isConnectable()){
                    SocketChannel channel = (SocketChannel) key.channel();
                    if (channel.isConnectionPending()){
                        channel.finishConnect();
                    }
                    channel.configureBlocking(false);
                    channel.register(selector,SelectionKey.OP_READ);
                    channel.write(ByteBuffer.wrap(new String("向服务端发消息").getBytes()));
                }else if (key.isReadable()){
                    read(key);
                }
            }
        }
    }

    public void read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(30);
        channel.read(buffer);
        String message = new String(buffer.array());
        System.out.println("来自服务端的消息："+message);
    }
    public  void  start(String adr,int port) throws IOException {
        init(adr,port);
        listen();
    }

    public static void main(String[] args) throws IOException {
        ClientNio clientNio = new ClientNio();
        clientNio.start("127.0.0.1",2016);
    }
}
