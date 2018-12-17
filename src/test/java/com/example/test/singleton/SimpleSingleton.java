package com.example.test.singleton;

/**
 * 简单单例 饿汉模式
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-22 14:15
 **/
public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton(){}

    public static SimpleSingleton getInstance(){
        return instance;
    }
}
