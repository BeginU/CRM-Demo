package com.example.test.AbstractFactory;

/**
 * 工厂生成器
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-22 10:59
 **/
public class ChocieFactory {

    public static AbstractFactory getcFactory(String some){
        if(some == null)
            return null;
        if(some.equals("color"))
            return new ColorFactory();
        if(some.equals("car"))
            return new CarFactory();
        return null;
    }

}
