package org.example;

public class ReplaceSpace {

    public static String replaceSpace(String arr) {
        arr = arr.replaceAll(" ", "%20");
        return arr;
    }
}
