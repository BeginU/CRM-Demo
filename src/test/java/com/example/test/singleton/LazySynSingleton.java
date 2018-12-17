package com.example.test.singleton;

/**
 * 单例之懒汉模式
 *  加锁线程安全，效率低
 * @author lumingming
 * @version 1.0
 * @create 2018-10-22 17:08
 **/
public class LazySynSingleton {
    private static LazySynSingleton instance;

    private LazySynSingleton(){}

    public static synchronized LazySynSingleton getInstance(){
        if(instance == null){
            instance = new LazySynSingleton();
        }
        return instance;
    }

}
