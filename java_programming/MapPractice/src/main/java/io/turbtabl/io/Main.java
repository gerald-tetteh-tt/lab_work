package io.turbtabl.io;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Hello",1);
        map.put("there",1);
        map.put("general",1);
        map.put("obi-wan",1);
        map.put("kenobi",1);
        map.put("!",1);

        map.forEach((key,value) -> System.out.println(key + " " + value));
    }
}