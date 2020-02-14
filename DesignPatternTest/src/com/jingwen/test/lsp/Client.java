package com.jingwen.test.lsp;

import java.util.HashMap;

public class Client {
    
    public static void invoker () {
        // 有父类的地方就有子类
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        invoker();
    }

}
