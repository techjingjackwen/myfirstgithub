package com.jingwen.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) throws Throwable {
        //
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2019-03-22 22:22:22");
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[] {IGamePlayer.class}, handler);
        //登录
        proxy.login("zhangsan", "password");
        //
        proxy.killBoss();
        //
        proxy.upgrade();
        //
        System.out.println("开始时间是：2019-03-22 22:22:52");
    }

}
