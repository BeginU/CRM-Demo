package com.example.test.AbstractFactory;

import com.example.test.AbstractFactory.Interface.Car;
import com.example.test.AbstractFactory.Interface.Color;
import com.sun.javafx.binding.StringFormatter;

/**
 * 抽象工厂用于使两者继承
 *
 * @author lumingming
 * @create 2018-10-22 10:40
 **/
public abstract class AbstractFactory{

    public abstract Car getCar(String carName);

    public abstract Color getColor(String color);
}
