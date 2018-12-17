package com.example.test.singleton;

/**
 * 单例之懒汉模式
 *  不适应于多线程
 * @author lumingming
 * @version 1.0
 * @create 2018-10-22 17:08
 **/
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance =  new LazySingleton();
        }
        return instance;
    }

}
