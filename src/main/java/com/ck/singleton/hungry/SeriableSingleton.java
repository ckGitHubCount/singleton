package com.ck.singleton.hungry;

import java.io.Serializable;
/*
* 序列化攻击，反序列化的时候，会再次初始化创建新的对象，重写readResolve退回到已有的对象，但是对象还是被创建了
* 等待JVM被回收
* */
public class SeriableSingleton implements Serializable {

    public  final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private  Object readResolve(){
        return  INSTANCE;
    }

}
