package ru.datana.demo.license;

import java.io.IOException;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) throws IOException {
        Class clazz = MainApp.class;
        System.out.println("Signer: " + Arrays.toString(clazz.getSigners()));

        System.out.println("sing");
    }
}