package com.example.test.Thread.base;

import static java.lang.Thread.sleep;

/**
 * 我的线程2
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-26 10:01
 **/
public class MyThread2 implements Runnable{
    private String name;

    public MyThread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+":"+i);
            try {
                sleep((int)Math.random()*10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
