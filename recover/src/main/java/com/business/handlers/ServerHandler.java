package com.business.handlers;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * netty
 * @author ccm
 * @version 1.0.0
 */
@Component
@Qualifier("serverHandler")
@ChannelHandler.Sharable
public class ServerHandler extends SimpleChannelInboundHandler<String> {

//    @Resource
//    private GoodsService goodsService;


    private static final Logger log = LoggerFactory.getLogger(ServerHandler.class);

    @Override
    public void channelRead0(ChannelHandlerContext ctx, String msg)
            throws Exception {
        log.info("Connected Successfully!");
        log.info("client msg:" + msg);
        String clientIdToLong = ctx.channel().id().asLongText();
        log.info("client long id:" + clientIdToLong);
        String clientIdToShort = ctx.channel().id().asShortText();
        log.info("client short id:" + clientIdToShort);

//        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
//        String clientIP = insocket.getAddress().getHostAddress();
//        int port = insocket.getPort();
//        System.out.println(clientIP);

//        if (msg.indexOf("bye") != -1) {
//            //close
//            ctx.channel().close();
//        } else if (msg.indexOf("request") != -1){
//            goodsService.sentTime(ctx);
//        } else {
//            //分割字符串1S123456789222945
//            //获取点的位置
//            String str1 = String.valueOf(msg.charAt(0));
//            //获取编号
//            String str2 = msg.substring(2, 11);
//            //获取时间
//            String str3 = msg.substring(11);
//
//            //根据id存储数据，如果数据库中有则存数据，没有则创建id
//            goodsService.insertGoodsById(str1, str2, str3);
//            //send to client
//            ctx.channel().writeAndFlush("Your msg is:" + msg);
//        }

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();

        log.info("IP : " + insocket.getAddress().getHostAddress() + " active !");
        log.info("port : " + insocket.getPort() + " active !");


        ctx.channel().writeAndFlush("Hello " + InetAddress.getLocalHost().getHostName() + " service!\n");


        super.channelActive(ctx);
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.info("\nChannel is disconnected");
        super.channelInactive(ctx);
    }
}
