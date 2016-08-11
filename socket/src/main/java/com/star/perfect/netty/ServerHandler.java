package com.star.perfect.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  服务端网络事件处理
 * Created by  wuyunxing on   2016/7/14.
 */

public class ServerHandler extends ChannelHandlerAdapter {

    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        System.out.println("服务器读取到客户端请求...");
        RpcRequest request = (RpcRequest)msg;
        System.out.println("rpc info is :"+request.getClassName()+"  "+request.getMethodDesc());

        String className = request.getClassName();
        Class clz = Class.forName(className);
        invokeMethod(clz,request.getMethodDesc());
//        ByteBuf buf=(ByteBuf) msg;
//        byte[] req=new byte[buf.readableBytes()];
//        buf.readBytes(req);
//        String body=new String(req,"UTF-8");
//        System.out.println("the time server receive order:"+body);
        String curentTime="成功";
        ByteBuf resp= Unpooled.copiedBuffer(curentTime.getBytes());
        ctx.write(resp);
        System.out.println("服务器做出了响应");
    }

        @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
        System.out.println("服务器readComplete 响应完成");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        ctx.close();
        System.out.println("服务器异常退出"+cause.getMessage());
    }

    protected void invokeMethod(Class<?> clz,String m) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Method method = clz.getMethod(m,null);
        method.invoke(clz.newInstance(),null);
    }
}
