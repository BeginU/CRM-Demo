package com.example.test.Thread.base;

/**
 * 我的线程3
 * 按照顺序打印出ABC十遍
 * @author lumingming
 * @version 1.0
 * @create 2018-10-26 15:40
 **/
public class MyThread3 implements Runnable{

    private String name;

    private String pre;

    private String self;

    public MyThread3(String name, String pre, String self) {
        this.name = name;
        this.pre = pre;
        this.self = self;
    }

    @Override
    public void run() {
        int count= 10;
        while (count != 0){
            // 获取前一个锁
            synchronized (pre){
                // 获取自身锁
                synchronized (self){
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    pre.wait();
                }catch (Exception e){
                    throw new IllegalThreadStateException();
                }
            }

        }
    }
}
