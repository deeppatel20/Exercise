package com.google.singletonprojects.singletonclasses;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton SERIALIZED_SINGLETON = new SerializedSingleton();
    }
    public static SerializedSingleton getInstance(){
        return SingletonHelper.SERIALIZED_SINGLETON;
    }
}
