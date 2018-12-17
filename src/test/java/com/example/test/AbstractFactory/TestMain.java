package com.example.test.AbstractFactory;

import com.example.test.AbstractFactory.Interface.Car;
import com.example.test.AbstractFactory.Interface.Color;
import org.junit.Test;

/**
 * 测试主方法
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-22 11:13
 **/
public class TestMain {
    @Test
    public void test(){
        AbstractFactory abstractFactory =  ChocieFactory.getcFactory("car");
        Car car = abstractFactory.getCar("宝马");
        car.sayName();
    }
}
