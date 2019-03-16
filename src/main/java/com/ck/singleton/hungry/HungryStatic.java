package com.ck.singleton.hungry;

/*
* 饿汉式单例模式
* 类加载时初始化
* 优点:保证单例，线程安全
* 缺点:容易造成资源浪费
* */
public class HungryStatic {
    private  static   final HungryStatic hungryStatic;
    static  {
        hungryStatic=new HungryStatic();
    }

    private void hungry() {}

    public static HungryStatic getSingleton(){
        return hungryStatic;
    }
}
