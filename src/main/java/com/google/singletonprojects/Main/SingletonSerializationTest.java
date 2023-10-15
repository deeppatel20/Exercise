package com.google.singletonprojects.Main;

import com.google.singletonprojects.singletonclasses.SerializedSingleton;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class SingletonSerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput objectOutput =new ObjectOutputStream(new FileOutputStream("filename.ser"));
        objectOutput.writeObject(instanceOne);
        objectOutput.close();

        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) objectInput.readObject();
        objectInput.close();

        log.info(String.valueOf(instanceOne.hashCode()));
        log.info(String.valueOf(instanceTwo.hashCode()));


    }
}
