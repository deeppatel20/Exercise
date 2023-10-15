package com.google.singletonprojects.singletonclasses;

import java.util.ListIterator;

public class ThreadSafeSingletonDoubleLocking {

    private ThreadSafeSingletonDoubleLocking(){}

    private static volatile ThreadSafeSingletonDoubleLocking threadSafeSingletonDoubleLocking;

    public static ThreadSafeSingletonDoubleLocking getThreadSafeSingletonDoubleLocking(){
        if(threadSafeSingletonDoubleLocking==null){
            synchronized (ThreadSafeSingletonDoubleLocking.class){
                if(threadSafeSingletonDoubleLocking==null){
                    return new ThreadSafeSingletonDoubleLocking();
                }
            }
        }
        return threadSafeSingletonDoubleLocking;
    }

}
