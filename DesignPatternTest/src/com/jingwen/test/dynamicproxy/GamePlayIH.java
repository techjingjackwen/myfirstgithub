package com.jingwen.test.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
    //
    Class cls = null;
    //
    Object obj = null;
    //
    public GamePlayIH(Object _obj) {
        this.obj = _obj;
    }
    //
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        //如果是登录方法，则发送消息
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录！");
            
        }
        return result;
    }
}
