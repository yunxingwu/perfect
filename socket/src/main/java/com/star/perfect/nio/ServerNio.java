package com.star.perfect.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by  wuyunxing on   2016/4/18.
 */

public class ServerNio {
    public void  init() throws IOException {
        ServerSocketChannel channel =  ServerSocketChannel.open();
        channel.configureBlocking(false);
        channel.socket().bind(new InetSocketAddress(2016));
        //获得通道管理器
        Selector selector = Selector.open();
        SelectionKey key = channel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            System.out.println("服务端启动，等待事件触发..........");
            selector.select();
            Iterator<SelectionKey> iterator  = selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey key1 = iterator.next();
                if (key1.isAcceptable()){
                    ServerSocketChannel channel1 =(ServerSocketChannel)key1.channel();
                    SocketChannel socketChannel = channel1.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_READ);
                    iterator.remove();
                    socketChannel.write(ByteBuffer.wrap(new String("发消息给客户端").getBytes()));
                }else if (key1.isReadable()){
                    read(key1);
                }
            }
        }

    }
    public void read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(30);
        channel.read(buffer);
        String message = new String(buffer.array());
        System.out.println("来自服务端的客户端的消息："+message);
    }

    public  void start() throws IOException {
        init();
    }

    public static void main(String[] args) throws IOException {
        ServerNio serverNio = new ServerNio();
        serverNio.start();
    }
}
