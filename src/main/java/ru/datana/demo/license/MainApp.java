package ru.datana.demo.license;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class MainApp {

    public static void main(String[] args) throws IOException {
        JarFile jar = new JarFile(new File("/home/lin/work-lanit/DatanaSoftwareLicensingCore/target/DatanaSoftwareLicensingCore-001.jar"), true);
        JarEntry jarEntry = jar.getJarEntry("u/datana/demo/license/MainApp.class");
        System.out.println("Cert: "+Arrays.toString(jarEntry.getCertificates()));

        System.out.println("Manifest:" + jar.getManifest());
        System.out.println("sing");
}
}