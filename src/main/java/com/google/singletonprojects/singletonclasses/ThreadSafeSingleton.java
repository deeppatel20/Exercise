package com.google.singletonprojects.singletonclasses;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton(){
        if(threadSafeSingleton==null){
            return new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }


}
