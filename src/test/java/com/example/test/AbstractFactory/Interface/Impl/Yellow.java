package com.example.test.AbstractFactory.Interface.Impl;

import com.example.test.AbstractFactory.Interface.Color;

/**
 * 红色
 *
 * @author lumingming
 * @create 2018-10-22 10:27
 **/
public class Yellow implements Color{
    @Override
    public void sayColor() {
        System.out.println("黄色");
    }
}
