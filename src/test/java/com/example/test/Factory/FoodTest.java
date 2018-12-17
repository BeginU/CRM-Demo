package com.example.test.Factory;

import org.junit.Test;
import sun.applet.Main;

/**
 * 水果测试
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-18 14:20
 **/
public class FoodTest {
    @Test
    public void test(){
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood("banana");
        food.color();
    }
}
