package com.google.trywithoutfinallyandcatch;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream fos = new FileOutputStream("Hello")){
            System.out.println("Hello");
        }
    }
}
