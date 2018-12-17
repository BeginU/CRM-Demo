package com.example.test.singleton;

/**
 * 双重校验锁
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-25 14:43
 **/
public class SingletonLock {
    private volatile static SingletonLock instance;

    private SingletonLock(){}

    public static  SingletonLock getInstace(){
        if(instance == null){
            synchronized (SingletonLock.class){
                if(instance == null){
                    return new SingletonLock();
                }
            }
        }
        return instance;
    }
}
