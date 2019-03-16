package com.ck.singleton.lazy;
/*
* 懒汉式
* 在外部调用时才创建实例对象
* 同步关键字在方法上
* */
public class SimpleLazy {
    private  SimpleLazy(){};
    private static SimpleLazy simpleLazy=null;

    public synchronized static SimpleLazy getInstance(){
        if (simpleLazy==null) {
            simpleLazy=new SimpleLazy();
        }
        return simpleLazy;
    }
}
