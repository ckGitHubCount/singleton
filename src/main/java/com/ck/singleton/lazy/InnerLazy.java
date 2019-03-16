package com.ck.singleton.lazy;

/*
* 内部类被初始化一次，所以创建的对象只有一个，
* 但是通过反射和反序列化会再次初始化类，破坏单例。
* 在父类构造函数内，添加判断，如果已经创建实例则抛出异常
* */
public class InnerLazy {

    private InnerLazy(){
        if(lazyys.INNER_LAZY!=null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    };

    public static final InnerLazy getInstance(){
            return lazyys.INNER_LAZY;
    }

    private static class lazyys{
        private static final  InnerLazy INNER_LAZY=new InnerLazy();
    }
}
