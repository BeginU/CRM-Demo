package com.example.test.singleton;

/**
 * 静态内部类单例
 * 可实现延迟加载，不会直接加载实例
 * @author lumingming
 * @version 1.0
 * @create 2018-10-25 14:49
 **/
public class SingletonInner {
    private static class SingletonHoder{
        private static final SingletonInner INSTANCE = new SingletonInner();

        private SingletonHoder(){}

        public static final SingletonInner getInstance(){
            return SingletonHoder.INSTANCE;
        }
    }
}
