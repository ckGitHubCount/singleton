package com.ck.singleton.threadlocal;

//使用threadlocal根据threadlocal的特性保证单线程内的单例
public class ThreadLocalSingleton {

    private static ThreadLocalSingleton threadLocalSingleton;

    private static ThreadLocal<ThreadLocalSingleton> threadLocal=new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }

}
