package ru.datana.demo.license;

import java.io.IOException;
import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) throws IOException {
        System.out.println("[Main:App] start");
        Class clazz = MainApp.class;
        System.out.println("Signer: " + Arrays.toString(clazz.getSigners()));

        DatanaWorker w = new DatanaWorker();
        w.hello();
        System.out.println("[Main:App] end");
    }
}