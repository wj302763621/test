package com.example.demo.threads;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.SocketUtils;

/**
 * Created by wangjian on 2017/8/28.
 */
public class UdpClient {

    static final int PORT = Integer.parseInt(System.getProperty("port", "7686"));

    public static void run(String str) throws Exception {

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioDatagramChannel.class)
                    .option(ChannelOption.SO_BROADCAST, true)
                    .handler(new UdpClientHandler());

            Channel ch = b.bind(0).sync().channel();

            // Broadcast the QOTM request to port 8080.
//            String str = "38567071 13801783144 18917565379 20170621183115 20170621183118 05";
            ch.writeAndFlush(new DatagramPacket(
                    Unpooled.copiedBuffer(str, CharsetUtil.UTF_8),
//                    SocketUtils.socketAddress("localhost", PORT))).sync();
                    SocketUtils.socketAddress("10.18.3.162", PORT))).sync();

            // QuoteOfTheMomentClientHandler will close the DatagramChannel when a
            // response is received.  If the channel is not closed within 5 seconds,
            // print an error message and quit.
            if (!ch.closeFuture().await(5000)) {
                System.err.println("QOTM request timed out.");
            }
        } finally {
            group.shutdownGracefully();
        }
    }
}
