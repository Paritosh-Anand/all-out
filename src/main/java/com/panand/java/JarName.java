package com.panand.java;

/**
 * Created by mmt5898 on 21/2/17.
 */
public class JarName {

    public static void main(String[] args) {
        int i = 0;
        String a = "hello";
        String b = "hello";

        Boolean x = (a == b);
        System.out.println(x);
        String n = new java.io.File(JarName.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath())
                .getName();

        System.out.println(n);
    }
}
