package com.example.demo.threads;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangjian on 2017/8/28.
 */

public class UdpClientHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    private static final Logger log= LoggerFactory.getLogger(UdpClientHandler.class);

    @Override
    public void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        String response = msg.content().toString(CharsetUtil.UTF_8);
        if (true) {
//            System.out.println("++++Quote of the Moment: " + response);
            log.info("==========>" + response.substring(6));
            ctx.close();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
