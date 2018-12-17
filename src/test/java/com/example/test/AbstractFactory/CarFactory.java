package com.example.test.AbstractFactory;

import com.example.test.AbstractFactory.Interface.Car;
import com.example.test.AbstractFactory.Interface.Color;
import com.example.test.AbstractFactory.Interface.Impl.Aodi;
import com.example.test.AbstractFactory.Interface.Impl.BaoMa;

/**
 * car工厂
 *
 * @author lumingming
 * @create 2018-10-22 10:44
 **/
public class CarFactory extends AbstractFactory{

    @Override
    public Car getCar(String carName) {
        if(carName == null){
            return null;
        }
        if(carName.equals("宝马")){
            return new BaoMa();
        }
        if(carName.equals("奥迪")){
            return new Aodi();
        }
       return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
