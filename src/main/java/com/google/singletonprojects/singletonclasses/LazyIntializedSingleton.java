package com.google.singletonprojects.singletonclasses;

public class LazyIntializedSingleton {
    private static LazyIntializedSingleton lazyIntializedSingleton;

    private LazyIntializedSingleton(){}

    public static LazyIntializedSingleton getLazyIntializedSingleton(){
        if(lazyIntializedSingleton==null){
            return new LazyIntializedSingleton();
        }
        return lazyIntializedSingleton;
    }
}
