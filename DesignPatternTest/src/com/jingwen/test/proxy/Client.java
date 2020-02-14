package com.jingwen.test.proxy;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //
        IGamePlayer proxy = new GamePlayerProxy("张三");
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
