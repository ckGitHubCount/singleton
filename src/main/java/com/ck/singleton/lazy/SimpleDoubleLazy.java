package com.ck.singleton.lazy;
/*
* 懒汉式
* 在外部调用时才创建实例对象
* 同步关键字加在方法里，并进行双重验证
*   初始化对象的过程
*   分配内存给对象初始化对象，引用指向对象，初次访问对象
* */
public class SimpleDoubleLazy {
    private SimpleDoubleLazy(){};
    private volatile static SimpleDoubleLazy simpleLazy=null;

    public synchronized static SimpleDoubleLazy getInstance(){
        if (simpleLazy==null) {
            synchronized (SimpleDoubleLazy.class) {
                if (simpleLazy==null) {
                    simpleLazy = new SimpleDoubleLazy();
                }
            }
        }
        return simpleLazy;
    }
}
