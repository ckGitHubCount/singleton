package com.ck.singleton.hungry;

/*
* 饿汉式单例模式
* 类加载时初始化
* 优点:保证单例，线程安全
* 缺点:容易造成资源浪费
* */
public class Hungry {
    private  static  final Hungry hungry =new Hungry();

    private void hungry() {}

    public static Hungry getSingleton(){
        return hungry;
    }
}
