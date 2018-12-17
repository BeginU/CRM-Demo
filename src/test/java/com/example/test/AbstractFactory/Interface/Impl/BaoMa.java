package com.example.test.AbstractFactory.Interface.Impl;

import com.example.test.AbstractFactory.Interface.Car;

/**
 * cheming
 *
 * @author lumingming
 * @create 2018-10-22 10:26
 **/
public class BaoMa implements Car{
    @Override
    public void sayName() {
        System.out.println("宝马");
    }
}
