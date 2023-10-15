package com.google.singletonprojects.singletonclasses;

public class EagerIntializedSingleton {
    private static final EagerIntializedSingleton eagerIntializedSingleton = new EagerIntializedSingleton();
    private EagerIntializedSingleton(){}

    public static EagerIntializedSingleton getEagerIntializedSingleton(){
        return eagerIntializedSingleton;
    }
}
