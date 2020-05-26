package com.business.handlers;

import io.netty.channel.ChannelHandlerContext;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * netty
 */
@Service
public class SendTime implements Runnable {

    private ChannelHandlerContext ctx;

    public void setChannelHandlerContext(ChannelHandlerContext ctx){
        this.ctx = ctx;
    }

    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//Date指定格式：yyyy-MM-dd HH:mm:ss:SSS
        Date date = new Date();//创建一个date对象保存当前时间
        String dateStr = simpleDateFormat.format(date);//format()方法将Date转换成指定格式的String
        ctx.channel().writeAndFlush(dateStr);
    }
}
