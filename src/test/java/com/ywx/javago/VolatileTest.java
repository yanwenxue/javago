package com.ywx.javago;

/**
 * @author ：yanwenxue
 * @date ：Created in 2020/5/15 11:36
 * @description：volatile测试
 * 参考：https://blog.csdn.net/sxfquqion/article/details/91411790
 * @modified By：
 * @version: 1.0
 */
public class VolatileTest extends Thread{
    //设置类静态变量,各线程访问这同一共享变量
    public static   boolean flag=false;
    //无限循环,等待flag变为true时才跳出循环
    public void run() {
        while (!flag){
            System.out.println("run:"+System.currentTimeMillis());
        };
    }
    public static void main(String[] args) throws Exception {
        new VolatileTest().start();
        System.out.println("main_before_sleep:"+System.currentTimeMillis());
        //sleep的目的是等待线程启动完毕,也就是说进入run的无限循环体了
        Thread.sleep(100);
        System.out.println("main_after_sleep:"+System.currentTimeMillis());
        flag = true;
    }
}

