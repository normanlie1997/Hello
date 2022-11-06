package com.zh;

import org.junit.Test;

/**
 * @author zhanghui
 * @create 2022/11/6 23:56
 */
public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
