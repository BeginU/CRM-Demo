package com.example.test.Thread.base;

/**
 * 继承thread
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-25 17:38
 **/
public class MyThread extends Thread{
    private String name;

    public MyThread(String name){
        this.name = name;
    }
    public void run(){
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
