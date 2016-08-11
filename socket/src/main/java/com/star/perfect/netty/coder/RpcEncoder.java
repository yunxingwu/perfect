package com.star.perfect.netty.coder;

import com.star.perfect.netty.RpcRequest;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by  wuyunxing on   2016/7/14.
 */

public class RpcEncoder extends MessageToByteEncoder <RpcRequest>{
    @Override
    protected void encode(ChannelHandlerContext ctx, RpcRequest rpcRequest, ByteBuf byteBuf) throws Exception {
        System.out.println("encode.....");
        byte[] body = SerializaUtil.objectTobyte(rpcRequest);  //将对象转换为byte，伪代码，具体用什么进行序列化，你们自行选择。可以使用我上面说的一些
        int dataLength = body.length;  //读取消息的长度
        byteBuf.writeInt(dataLength);  //先将消息长度写入，也就是消息头
        System.out.println("message lenth:"+dataLength);
        byteBuf.writeBytes(body);  //消息体中包含我们要发送的数据
        ctx.flush();
    }


}
