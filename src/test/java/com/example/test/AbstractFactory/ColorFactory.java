package com.example.test.AbstractFactory;

import com.example.test.AbstractFactory.Interface.Car;
import com.example.test.AbstractFactory.Interface.Color;
import com.example.test.AbstractFactory.Interface.Impl.Red;
import com.example.test.AbstractFactory.Interface.Impl.Yellow;

/**
 * 颜色工厂
 *
 * @author lumingming
 * @create 2018-10-22 10:47
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Car getCar(String carName) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null)
            return null;
        if(color.equals("红色")){
            return new Red();
        }
        if(color.equals("黄色")){
            return new Yellow();
        }
        return null;
    }
}
