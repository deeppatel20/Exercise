package com.google.singletonprojects.singletonclasses;

public class StaticIntializedSingleton {

    private static final StaticIntializedSingleton staticIntializedSingleton;
    private StaticIntializedSingleton(){}

    static {
        staticIntializedSingleton = new StaticIntializedSingleton();
    }

    public static StaticIntializedSingleton getStaticIntializedSingleton(){
        return staticIntializedSingleton;
    }
}
