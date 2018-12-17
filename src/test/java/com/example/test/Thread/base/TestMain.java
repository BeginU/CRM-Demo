package com.example.test.Thread.base;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.SortedSet;

/**
 * 测试主类
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-10-26 9:43
 **/
public class TestMain {
    @Test
    public void test(){
        MyThread myThread = new MyThread("A");
        MyThread myThread1 = new MyThread("B");
        //myThread.run();
         myThread1.run();
        //myThread.start();
        //myThread1.start();
    }
    @Test
    public void test1(){
        MyThread2 myThread = new MyThread2("A");
        MyThread2 myThread1 = new MyThread2("B");
        myThread.run();
        myThread1.run();
    }

    @Test
    public void test2(){
        int count = 20*1000000;
        ArrayList arrayList = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i=0;i<count;i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        ArrayList arrayList1 = new ArrayList(count);
        long start1 = System.currentTimeMillis();
        for (int i=0;i<count;i++){
            arrayList1.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
    }

    /**
    *  冒泡排序算法（降序）
    * @author lumingming
    * @date 2018/10/29
    * @param
    * @return
    */
    @Test
    public void test3(){
        int arr[] = {21,33,13,13,13,13,13,0,24,555,6,6,89,108,18};
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }

    /**
    *  快速排序法
    * @author lumingming
    * @date 2018/10/29
    * @param
    * @return
    */
    public void quickSort(int[] arr,int low,int high){
        int start = low;
        int end = high;
        int key = arr[low];
        while (start < end){
            // 先从右边比较
            while(start < end && arr[end]>= key){
                end--;
                if(arr[end] <= key){
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                }
            }
            while(start < end && arr[end]<= key){
                start++;
                if(arr[start] >= key){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
            }
        }
        // 递归
        if(start>low){
            quickSort(arr,low,start-1);
        }
        if(high>end){
            quickSort(arr,end+1,high);
        }
    }

    public void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];


        while(end>start){
            //从后往前比较
            while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
    }


    @Test
    public void test4(){
        int arr[] = {21,33,13,13,13,13,13,0,24,555,6,6,89,108,18};
        quickSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
