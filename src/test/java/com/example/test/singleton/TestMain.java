package com.example.test.singleton;

/**
 * @author lumingming
 * @create 2018-10-22 16:59
 **/
public class TestMain {

    public void test(){
        // 构造函数私有化
        // SimpleSingleton simpleSingleton = new SimpleSingleton();
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
    }
}
