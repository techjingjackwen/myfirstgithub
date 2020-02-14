package com.jingwen.test.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {
    // 缩小输入参数范围
    public Collection doSomething (Map map) {
        System.out.println("子类被执行……");
        return map.values();
    }
}
