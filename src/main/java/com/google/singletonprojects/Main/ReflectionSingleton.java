package com.google.singletonprojects.Main;

import com.google.singletonprojects.singletonclasses.EagerIntializedSingleton;
import com.google.singletonprojects.singletonclasses.EnumSingleton;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;

@Slf4j
public class ReflectionSingleton {
    public static void main(String[] args) {
        EagerIntializedSingleton eagerIntializedSingletonOne = EagerIntializedSingleton.getEagerIntializedSingleton();
        EagerIntializedSingleton eagerIntializedSingletonTwo = null;


        Constructor[] constructors = EagerIntializedSingleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                eagerIntializedSingletonTwo = (EagerIntializedSingleton) constructor.newInstance();
                break;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        log.info(String.valueOf(eagerIntializedSingletonOne.hashCode()));
        log.info(String.valueOf(eagerIntializedSingletonTwo.hashCode()));

    }
}
