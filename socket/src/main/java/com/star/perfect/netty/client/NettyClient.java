package com.star.perfect.netty.client;

import com.star.perfect.netty.RpcRequest;
import com.star.perfect.netty.coder.RpcEncoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Created by  wuyunxing on   2016/7/14.
 */

public class NettyClient {
    private String host = "127.0.0.1";
    private int port = 2018;
    private HandlerManager manager;
    public NettyClient(HandlerManager manager){
        this.manager = manager;
    }
    public void connect() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, true)
                    .handler(manager);
            ChannelFuture future = b.connect(this.host, this.port).sync();
            future.channel().closeFuture().sync();
        }finally {
            group.shutdownGracefully();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        RpcRequest request = new RpcRequest("com.star.perfect.netty.server.Hello","hello",null,null);
        HandlerManager manager = new HandlerManager();
        manager.addHandler(new ClientHandler(request));
        new NettyClient(manager).connect();
    }
}
