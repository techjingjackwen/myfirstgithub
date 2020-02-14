package com.jingwen.test.proxyindirect;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //
        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player);
        IGamePlayer proxy = player.getProxy();
        //
        System.out.println("开始时间是：2019-03-22 22:22:22");
        proxy.login("zhangsan", "password");
        //
        proxy.killBoss();
        //
        proxy.upgrade();
        //
        System.out.println("开始时间是：2019-03-22 22:22:52");
    }

}
