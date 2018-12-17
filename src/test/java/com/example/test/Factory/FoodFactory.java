package com.example.test.Factory;

/**
 * 水果工厂类
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-18 14:15
 **/
public class FoodFactory {
    public Food getFood(String foodType){
        if("banana".equals(foodType)){
            return new Banana();
        }
        if("orange".equals(foodType)){
            return new Orange();
        }
        if("apple".equals(foodType)){
            return new Apple();
        }
        return null;
    }
}
